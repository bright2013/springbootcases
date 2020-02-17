package com.example.shiro.todo.controllers;


import com.example.shiro.todo.domain.Todo;
import com.example.shiro.todo.repository.TodoRepository;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

	@Autowired
	TodoRepository todoRepository;

	@GetMapping("/index")
	@RequiresRoles(logical = Logical.OR, value = {"admin", "author"})
	public String index() {
		Subject subject = SecurityUtils.getSubject();
		return "index";
	}
	
	@GetMapping("/todos")
	@RequiresRoles(logical = Logical.OR, value = {"admin", "author"})
	public String todos(Model model) {
		model.addAttribute("todos", todoRepository.findAll());
		return "todos";
	}
	
	@PostMapping("/todoNew")
	@RequiresRoles(logical = Logical.OR, value = {"admin", "author"})
	public String add(@RequestParam String todoItem, @RequestParam String status, Model model) {
		Todo todo = new Todo();
		todo.setTodoItem(todoItem);
		todo.setCompleted(status);
		todoRepository.save(todo);
		model.addAttribute("todos", todoRepository.findAll());
		return "redirect:/todos";
	}
	
	@PostMapping("/todoDelete/{id}")
	@RequiresPermissions("todo:delete")
	public String delete(@PathVariable long id, Model model) {
		todoRepository.deleteById(id);
		model.addAttribute("todos", todoRepository.findAll());
		return "redirect:/todos";
	}
	
	@PostMapping("/todoUpdate/{id}")
	@RequiresRoles(logical = Logical.OR, value = {"admin", "author"})
	public String update(@PathVariable long id, Model model) {
		Todo todo = todoRepository.findById(id).get();
		if("未完成".equals(todo.getCompleted())) {
			todo.setCompleted("完成");
		}else {
			todo.setCompleted("未完成");
		}
		todoRepository.save(todo);
		model.addAttribute("todos", todoRepository.findAll());
		return "redirect:/todos";
	}
}

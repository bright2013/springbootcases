INSERT INTO t_users(user_id, username,password,groupname, enabled) VALUES (1, '张三','{noop}123456', 1, true);
INSERT INTO t_users(user_id, username,password,groupname, enabled) VALUES (2, '李四','{noop}123456', 2, true);
INSERT INTO t_users(user_id, username,password,groupname, enabled) VALUES (3, '王五','{noop}123456', 2, true);


INSERT INTO t_user_roles (user_role_id, username, rolename) VALUES (1, '张三', 'ROLE_USER');
INSERT INTO t_user_roles (user_role_id, username, rolename) VALUES (2, '张三', 'ROLE_TEACHER');
INSERT INTO t_user_roles (user_role_id, username, rolename) VALUES (3, '李四', 'ROLE_STUDENT');
INSERT INTO t_user_roles (user_role_id, username, rolename) VALUES (4, '李四', 'ROLE_GROUPLEADER');
INSERT INTO t_user_roles (user_role_id, username, rolename) VALUES (5, '王五', 'ROLE_STUDENT');
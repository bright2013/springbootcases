package com.excel.demo.repositories;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.excel.demo.domains.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserJpaRepositoryTest {
	
	@Autowired
	private UserJpaRepository userJpaRepo;
	
	@Before
	public void setup() {
		
		IntStream.range(1, 10).forEach(i->userJpaRepo.save(User.builder().name("A"+i).age(10+i).sex(i%2==0?User.SEX.M:User.SEX.F).build()));
	}
	
	@Test
	public void testSave() {
		userJpaRepo.deleteAll();
		User u1=User.builder().name("A1").age(10).sex(User.SEX.M).build();
		userJpaRepo.save(u1);
		Assert.assertEquals(1, userJpaRepo.count());
	}
	
	

}

package com.lyc;

import com.lyc.dao.userDao;
import com.lyc.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private userDao userDao;
	@Test
	void contextLoads() {
		user name = userDao.getById(2);
		System.out.println("name = " + name);
	}

}

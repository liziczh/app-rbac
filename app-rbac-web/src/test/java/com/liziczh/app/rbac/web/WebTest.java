package com.liziczh.app.rbac.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liziczh.app.rbac.mybatisplus.MybatisPlusApplication;
import com.liziczh.app.rbac.service.ServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(classes = { MybatisPlusApplication.class, ServiceApplication.class, WebApplication.class })
@SpringBootTest()
@ActiveProfiles("test")
public class WebTest {
	@Test
	public void webTest() {
	}
}

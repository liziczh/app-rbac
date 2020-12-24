package com.liziczh.app.rbac.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.app.rbac.mybatisplus.MybatisPlusApplication;
import com.liziczh.app.rbac.ref.RefApplication;

@SpringBootApplication(scanBasePackages = { "com.liziczh.*" })
public class ServiceApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RefApplication.class, ServiceApplication.class };
		SpringApplication.run(sources, args);
	}
}

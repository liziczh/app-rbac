package com.liziczh.app.rbac.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.app.rbac.internal.InternalApplication;
import com.liziczh.app.rbac.mybatisplus.MybatisPlusApplication;
import com.liziczh.app.rbac.ref.RefApplication;
import com.liziczh.app.rbac.service.ServiceApplication;

@SpringBootApplication(scanBasePackages = { "com.liziczh.*" })
public class WebApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RefApplication.class, InternalApplication.class, ServiceApplication.class, WebApplication.class };
		SpringApplication.run(sources, args);
	}
}

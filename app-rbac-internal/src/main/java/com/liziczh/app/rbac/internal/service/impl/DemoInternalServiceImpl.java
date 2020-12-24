package com.liziczh.app.rbac.internal.service.impl;

import org.springframework.stereotype.Component;

import com.liziczh.app.rbac.internal.service.DemoInternalService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DemoInternalServiceImpl implements DemoInternalService {
	@Override
	public String hello() {
		return null;
	}
}

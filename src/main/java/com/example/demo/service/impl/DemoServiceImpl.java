package com.example.demo.service.impl;
/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 下午3:22:49 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */

import org.springframework.stereotype.Service;

import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello() {
		return "hello from service layer";
	}

}

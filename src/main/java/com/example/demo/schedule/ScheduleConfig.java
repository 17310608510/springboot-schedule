package com.example.demo.schedule;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 下午3:30:02 
 * @version 1.0 
 * @parameter 
 * @since 并行多线程任务功能（方式一）
 * @return 
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer{

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// 开启一个固定10个大小的线程池，也使用Executors下其他的线程池
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
	}

}

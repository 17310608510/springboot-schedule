package com.example.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年11月12日 下午3:38:36
 * @version 1.0
 * @parameter
 * @since 任务中心2：通过异步方式执行调度任务
 * 
 *        配置Application入口的@EnableAsync，在定时任务方法前面配置@Async，即配置了任务线程池
 * @return
 */
@Component
public class ScheduledTasksAsync {
	protected static Logger logger = LoggerFactory.getLogger(ScheduledTasksAsync.class);
	
	// 启动立即执行
	// 每5秒执行一次
	@Async
	@Scheduled(initialDelay = 1000, fixedDelay = 5000)
	public void test4() {
		logger.info("test4这里，每5秒执行一次");
	}
}

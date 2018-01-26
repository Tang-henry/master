package com.andy.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Spring调度任务
 * @author liuyazhuang
 *
 */
@Component("demoTask")
public class DemoTask{
	
	private static final Logger logger = LoggerFactory.getLogger("DemoTask");
	
	public void task1() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task1 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task2() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task2 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task3() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task3 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task4() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task4 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task5() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task5 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task6() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task6 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task7() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task7 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void task8() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				logger.info("task8 are running for " + i + "seconds...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
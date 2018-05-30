package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.test.task.IATask;


@Component
public class Demo implements IATask{
	
	@Scheduled(cron="0/5 * *  * * ? ")
	public void aTask() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.toString());
		
	}
	
}

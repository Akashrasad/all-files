package com.market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class futureDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		Future<String> future = executorService.submit(() -> {
			Thread.sleep(10000);
			return "completed";
			
		});
//		public class home { 
//	    
//	        Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.out.println("Driver Found");
//	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "root");
//	        System.out.println("connection success : "+connection);
//		}
//		
		try {
			while (! future.isDone()) {
				System.out.println("task still in progress ... wait");
				Thread.sleep(500);
			}
			System.out.println("task completed !");
			String result=future.get(3000,TimeUnit.MILLISECONDS);
			System.out.println(result);
			executorService.shutdown();  
		} catch(InterruptedException | ExecutionException| TimeoutException e) {
			future.cancel(true);
			future.isDone();
			future.isCancelled();
		}

	}

}

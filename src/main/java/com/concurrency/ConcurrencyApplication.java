package com.concurrency;

import com.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurrencyApplication {

	public static void main(String[] args) {
		User user=new User();
		user.setAge(1).setName("aaa");
		System.out.println(user.toString());

	//	SpringApplication.run(ConcurrencyApplication.class, args);
	}
}

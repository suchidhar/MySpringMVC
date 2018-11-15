
package com.dev.repo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("repos")
public class JDBCImpl {
	public void login() {
		System.out.println("Login is happening");
	}
}
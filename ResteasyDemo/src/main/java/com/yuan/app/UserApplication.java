package com.yuan.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import com.yuan.resteasy.UserServiceImpl;




public class UserApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public UserApplication() {
		singletons.add(new UserServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}

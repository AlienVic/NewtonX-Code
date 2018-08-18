package com.yuan.service;

import com.yuan.model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class UserService {
	Map<Integer, User> store = new HashMap<Integer, User>();

	/**
	 * @Contructor: initialize the value of store
	 */
	public UserService() {
		User u1 = new User();
		u1.setfirstName("Yuan");
		u1.setlastName("Li");
		u1.setId(1);

		/*
			we could use uuid to unique identify one user
		*/
		//UUID uuid =  UUID.randomUUID();
		//u1.setUUID(uuid);

		User u2 = new User();
		u2.setfirstName("Yoon");
		u2.setlastName("Lee");
		u2.setId(2);

		store.put(1, u1);
		store.put(2, u2);
	}

	/**
	 * GET UserMap
	 */
	public Map getUserMap() {
		return store;
	}

	/**
	 * GET one use by user id
	 */
	public User getUserById(int id) {
		return store.get(id);
	}

	/**
	 * GET all users from storage
	 */
	public User[] getAllUsers() {
		User[] u = new User[store.size()];
		int i = 0;
		for(User one: store.values()) {
			u[i] = one;
			i++;
		}
		return u;
	}
}

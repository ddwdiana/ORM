package com.unitbv.dao;

import javax.ejb.Remote;

@Remote
public interface BaseDAORemote<T> {
	void add(T entry);

	void update(T entry);

	T getById(int id);

	void delete(int id);
}

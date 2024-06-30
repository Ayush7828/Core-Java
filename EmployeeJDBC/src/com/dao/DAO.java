package com.dao;

import java.util.List;

public interface DAO<T> {
	void save(T object);

	void update(T object);

	void delet(int id);

	List<T> fetch();
}

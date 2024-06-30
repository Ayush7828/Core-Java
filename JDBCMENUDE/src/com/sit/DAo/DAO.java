package com.sit.DAo;

import java.util.List;

public interface DAO<T> {
	void save(T object);

	void update(T object);

	void delete(int id);

	List<T> fecth();
}

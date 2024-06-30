package utils;

import com.dao.EmployeeDAoIMP;
import com.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EmployeeDAoIMP obj = new EmployeeDAoIMP();
		Employee e = new Employee();
		obj.save(e);
		obj.update(e);

	}

}

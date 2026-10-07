package com.EmployeeSystem;

import java.util.Comparator;

public class SortbySalary implements Comparator<Employee>
	{
		public int compare(Employee obj1 , Employee obj2)
			{
				Integer I1 = obj1.getSalary();
				Integer I2 = obj2.getSalary();
				return I2.compareTo(I1);
			}
	}

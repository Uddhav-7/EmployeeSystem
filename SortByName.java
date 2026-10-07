package com.EmployeeSystem;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>
	{
		public int compare(Employee obj1 , Employee obj2)
			{
				String s1 = obj1.getEmployeeName();
				String s2 = obj2.getEmployeeName();
				return s1.compareTo(s2);
			}
	}

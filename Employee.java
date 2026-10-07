package com.EmployeeSystem;

import java.util.Comparator;

public class Employee implements Taxable , Comparator<Employee>
	{
	public Employee()
		{
			
		}
	
	
		private int employeeId;
		private String employeeName;
		private String email;
		private String department;
		private int salary;
		private String	joiningYear;
		public Employee(int employeeId, String employeeName, String email, String department, int salary,
				String joiningYear) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.email = email;
			this.department = department;
			this.salary = salary;
			this.joiningYear = joiningYear;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getJoiningYear() {
			return joiningYear;
		}
		public void setJoiningYear(String joiningYear) {
			this.joiningYear = joiningYear;
		}
		
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
					+ ", department=" + department + ", salary=" + salary + ", joiningYear=" + joiningYear + "]";
		}
		
		public void calculateSalary()
		{
			
		}
		
		
		public void  calculateTax()
			{
				double tax=0;
				if(salary<=30000)
					{
						System.out.println("No Tax..");
					}
				else if(salary>=30001 && salary<=50000)
					{
						tax = salary*0.5;
					}
				else if(salary>=50001 && salary<=100000)
				{
					tax = salary*0.10;
				}
				else if(salary>100000)
				{
					tax = salary*0.20;
				}
				
				System.out.println("Total Tax on Your Salary : " + tax);
				
					
			}
		
		
		public int compare(Employee obj1  , Employee obj2)
			{
				Integer id1 = obj1.getEmployeeId();
				Integer id2 = obj2.getEmployeeId();
				return id1.compareTo(id2);
			}
		
		
	}

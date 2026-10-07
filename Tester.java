package com.EmployeeSystem;

public class Tester extends Employee
	{
		String testingTool;
		String automation;
		public Tester(int employeeId, String employeeName, String email, String department, int salary,
				String joiningYear, String testingTool, String automation) {
			super(employeeId, employeeName, email, department, salary, joiningYear);
			this.testingTool = testingTool;
			this.automation = automation;
		}
		public String getTestingTool() {
			return testingTool;
		}
		public void setTestingTool(String testingTool) {
			this.testingTool = testingTool;
		}
		public String getAutomation() {
			return automation;
		}
		public void setAutomation(String automation) {
			this.automation = automation;
		}
		
		public String toString() {
			return super.toString()+ "Tester [testingTool=" + testingTool + ", automation=" + automation + "]";
		}
		
		
		public void calculateSalary()
		{
			double s = this.getSalary()*(0.10);
			System.out.println("Your Salary is : "+this.getSalary());
			System.out.println("Your Bonus is : " + s);
		}
		
		
	}

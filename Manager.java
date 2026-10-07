package com.EmployeeSystem;

public class Manager extends Employee 
	{
		int teamSize;
		String projectName;
		public Manager(int employeeId, String employeeName, String email, String department, int salary,
				String joiningYear, int teamSize, String projectName) {
			super(employeeId, employeeName, email, department, salary, joiningYear);
			this.teamSize = teamSize;
			this.projectName = projectName;
		}
		public int getTeamSize() {
			return teamSize;
		}
		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		
		public String toString() {
			return super.toString()+ "Manager [teamSize=" + teamSize + ", projectName=" + projectName + "]";
		}
		
		
		public void calculateSalary()
		{
			double s = this.getSalary()*(0.30);
			System.out.println("Your Salary is : "+this.getSalary());
			System.out.println("Your Bonus is : " + s);
		}
		
		
		
	}

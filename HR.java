package com.EmployeeSystem;

public class HR extends Employee
	{
		String recruitmentTarget;

		public HR(int employeeId, String employeeName, String email, String department, int salary, String joiningYear,
				String recruitmentTarget) {
			super(employeeId, employeeName, email, department, salary, joiningYear);
			this.recruitmentTarget = recruitmentTarget;
		}

		public String getRecruitmentTarget() {
			return recruitmentTarget;
		}

		public void setRecruitmentTarget(String recruitmentTarget) {
			this.recruitmentTarget = recruitmentTarget;
		}

		
		public String toString() {
			return super.toString()+"HR [recruitmentTarget=" + recruitmentTarget + "]";
		}
		
		public void calculateSalary()
		{
			double s = this.getSalary()*(0.15);
			System.out.println("Your Salary is : "+this.getSalary());
			System.out.println("Your Bonus is : " + s);
		}
		
	}

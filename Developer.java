package com.EmployeeSystem;


public class Developer extends Employee 
	{
		private String programmingLanguage;
		private double experience;
		
		public Developer()
		{
			
		}
		public Developer(int employeeId, String employeeName, String email, String department, int salary,
				String joiningYear, String programmingLanguage, double experience) {
			super(employeeId, employeeName, email, department, salary, joiningYear);
			this.programmingLanguage = programmingLanguage;
			this.experience = experience;
		}

		public String getProgrammingLanguage() {
			return programmingLanguage;
		}

		public void setProgrammingLanguage(String programmingLanguage) {
			this.programmingLanguage = programmingLanguage;
		}

		public double getExperience() {
			return experience;
		}

		public void setExperience(double experience) {
			this.experience = experience;
		}

		@Override
		public String toString() {
			return super.toString()+"Developer [programmingLanguage=" + programmingLanguage + ", experience=" + experience + "]";
		}
		
		
		public void calculateSalary()
			{
				double s = this.getSalary()*(0.20);
				System.out.println("Your Salary is : "+this.getSalary());
				System.out.println("Your Bonus is : " + s);
			}
		
		
		
		
	}

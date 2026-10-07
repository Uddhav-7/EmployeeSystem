package com.EmployeeSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
		static ArrayList<Employee> al = new ArrayList<Employee>();
		static Scanner sc = new Scanner(System.in);
		
		// Developer Field
		static String lan = null;
		static double ex = 0;
		
		// Manager Field
		static int tSize=0;
		static String proName;
		
		//HR Field
		static String recruitmentTarget;
		
		// Tester Filed
		static String testingTool;
		static String automation;
				
		public static void main(String[] args) 
			{
				Employee e1 = new Developer(1401, "Kishor", "kishor@gmail.com", "Web-Devloper", 
			98000, "13-03-2026", "Java Script", 0.6);
				
				Employee e2 = new Developer(104, "Rakesh", "ram@gmail.com", "Backend-Devloper", 
						67000, "21-12-2025", "Java", 0.9);
				
				
				Employee e3 = new Developer(103, "Shila", "shilaki@gmail.com", "UI-Devloper", 
						89000, "15-04-2026", "React", 1.6);
				
				al.add(e1);
				al.add(e2);
				al.add(e3);
				Collections.sort(al , new Developer());
				
				System.out.println("Wel-Come To The Employee Managment System : ");
				System.out.println("Enter 1 For All Employee Data : ");
				System.out.println("Enter 2 For Add new Employee : ");
				System.out.println("Enter 3 For Get Employee By Id : ");
				System.out.println("Enter 4 Delete Employee By ID : ");
				System.out.println("Enter 5 For Sort By Salary : ");
				System.out.println("Enter 6 Sort By Name : ");
				System.out.println("Enter 7 Update Salary By Id : ");
				int val = sc.nextInt();
				switch (val) {
				case 1: Main.getAll();break;				
				case 2: Main.addEmp();break;	
				case 3: Main.getById();break;
				case 4: Main.deleteById();break;
				case 5: Main.sortBySalary();break;
				case 6: Main.sortByName();break;
				case 7: Main.updateSalary();break;
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + val);
				}
				
			}
		
		
		public static void getAll()
			{
				Iterator<Employee> itr = al.iterator();
				while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
			}
		
		
		
		
		public static void addEmp()
			{
			
			System.out.println("Enter 1 for Delevoper Role : ");
			System.out.println("Enter 2 for Manager Role : ");
			System.out.println("Enter 3 for HR Role : ");
			int v = sc.nextInt();
			
			if(v==1)
				{
					Employee e = input();
					System.out.println("Enter Your Programing Language : ");
					lan = sc.next();
					System.out.println("Enter Employee Exprience :");
					ex = sc.nextDouble();
					
					Employee e1 = new Developer(
							e.getEmployeeId(),
			                e.getEmployeeName(),
			                e.getEmail(),
			                e.getDepartment(),
			                e.getSalary(),
			                e.getJoiningYear(),
			                lan,
			                ex
							);
					al.add(e1);
					System.out.println(e1);
					System.out.println("Developer Added Successfully...!");
				}
			
			else if(v==2)
				{
					Employee e = input();
					System.out.println("Enter Your Team Size : ");
					tSize = sc.nextInt();
					System.out.println("Enter Project Name :");
					proName = sc.next();
				
					Employee e1 = new Manager(
							e.getEmployeeId(),
							e.getEmployeeName(),
							e.getEmail(),
							e.getDepartment(),
							e.getSalary(),
							e.getJoiningYear(),
							tSize,
							proName
							);
					al.add(e1);
					System.out.println(e1);
					System.out.println("Manager Added Successfully...!");
				}
			
			else if(v==3)
			{
				Employee e = input();
				System.out.println("Enter Recruitment Target : ");
				testingTool = sc.next();
			
				Employee e1 = new HR(
						e.getEmployeeId(),
						e.getEmployeeName(),
						e.getEmail(),
						e.getDepartment(),
						e.getSalary(),
						e.getJoiningYear(),
						recruitmentTarget
						);
				al.add(e1);
				System.out.println(e1);
				System.out.println("HR Added Successfully...!");
			}
			
			else if(v==4)
			{
				Employee e = input();
				System.out.println("Enter Recruitment Target : ");
				testingTool = sc.next();
			
				Employee e1 = new Tester(
						e.getEmployeeId(),
						e.getEmployeeName(),
						e.getEmail(),
						e.getDepartment(),
						e.getSalary(),
						e.getJoiningYear(),
						testingTool,
						automation
						);
				al.add(e1);
				System.out.println(e1);
				System.out.println("Tester Added Successfully...!");
			}
			
			}
		
		
		public static Employee input()
			{
				System.out.println("Enter Employee Id : ");
				int id = sc.nextInt();
				Iterator<Employee> itr = al.iterator();
				while(itr.hasNext())
					{
						Employee next = itr.next();
						if(next.getEmployeeId() == id)
							{
								System.err.println("Already Exists With this Id ");
								
							}
						break;
					}
				
				System.out.println("Enter Employee Name : ");
				String name = sc.next();
				System.out.println("Enter Employee Email : ");
				String email = sc.next();
				System.out.println("Enter Employee Department : ");
				String dep = sc.next();
				System.out.println("Enter Employee Salary : ");
				int sal = sc.nextInt();
				System.out.println("Enter Employee Joining Year : ");
				String join = sc.next();
				
				return new Employee(id, name, email, dep, sal, join);
			}
		
		public static void getById()
			{
				System.out.println("Enter Employee Id : ");
				int id = sc.nextInt();
				boolean got = false;
				Iterator<Employee> itr = al.iterator();
						while(itr.hasNext())
							{
								Employee next = itr.next();
								if(next.getEmployeeId()==id)
									{
										System.out.println("Employee Found With id : ");
										got=true;
										System.out.println(al);
									}
							}
						
						if(!got)
						{
							System.out.println("Employee Does Not Exist...!");
						}
			}
			
		
		
		public static void deleteById()
			{	
				Iterator<Employee> itr = al.iterator();
				System.out.println("Enter Employee For Delete : ");
				int id=sc.nextInt();
				boolean deleted=false;
				while(itr.hasNext())
					{
						Employee next = itr.next();
						if(id==next.getEmployeeId())
							{
								System.out.println("Employee Found..!!");
								System.out.println(al);
								deleted=true;
								itr.remove();
								System.out.println("Employee Deleted Successfully...!");
							}
					}
				if(!deleted)
				{
					System.out.println("Employee Does Not Exist...!");
				}
			}
		
		
		public static void sortBySalary()
			{
				Collections.sort(al, new SortbySalary());
				for(Employee e:al)
					{
						System.out.println("Name : "+e.getEmployeeName()+"  Salary : "+
						e.getSalary()+"  Department : "+e.getDepartment());
					}
			}
		
		
		
		public static void sortByName()
			{
				Collections.sort(al , new SortByName());
				for(Employee e:al)
					{
						System.out.println(e);
					}
			}
		
		
		
		public static void updateSalary()
			{
				
				ListIterator<Employee> itr = al.listIterator();
				System.out.println("Enter Employee Id : ");
				int id = sc.nextInt();
				boolean updated = false;
				while(itr.hasNext())
					{
						Employee next = itr.next();
						if(id==next.getEmployeeId())
							{
								System.out.println("Enter New Salary : ");
								int sal = sc.nextInt();
								next.setSalary(sal);
								updated=true;
								itr.set(next);
								System.out.println("Salary Updated Successful...!");
								System.out.println("Name : "+next.getEmployeeName()+"  Updated Salary : "+next.getSalary());
								break;
							}
					}
				if(!updated)
					{
						System.out.println("Employee Does Not Exist...!");
					}
			}
		
		
		

}

















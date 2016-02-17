package com.company.DOADB;


public class StudentsMain {
	
	
	    public static void main(String[] args)
	    {
		IStudents stuTest = new StudentImplementation();
		
		System.out.println("Create");
		//create
		Students stu1 = new Students(0, "Evashan", 23, "Johannesburg");
		Students stu2 = new Students(1, "Pieter", 23, "Centurion");
		Students stu3 = new Students(2, "Paul", 23, "Durban");
		
		stuTest.addStudents(stu1);
		stuTest.addStudents(stu2);
		stuTest.addStudents(stu3);

		//read
	    System.out.println("Details");
		for (Students student1 : stuTest.getAllStudents())
		{
		    String data;
		    data = student1.getId() +" "+ student1.getName() +" "+ student1.getAge() +" "+ student1.getCity();
		    System.out.println(data);
		}
		
		System.out.println("");
		System.out.println("Update");

		//update
		Students student = stuTest.getAllStudents().get(1);
		student.setName("Carly");
		stuTest.updateStudents(student);
		
		//read
		System.out.println("Details");
				for (Students student2 : stuTest.getAllStudents())
				{
				    String data;
				    data = student2.getId() +" "+ student2.getName() +" "+ student2.getAge() +" "+ student2.getCity();
				    System.out.println(data);
				}
				System.out.println("");
				System.out.println("Delete");
		//delete
		stuTest.deleteStudents(2);
		
		//read
	    System.out.println("Details");
		for (Students student3 : stuTest.getAllStudents())
		{
		    String data;
		    data = student3.getId() +" "+ student3.getName() +" "+ student3.getAge() +" "+ student3.getCity();
		    System.out.println(data);
		}
	    }

}

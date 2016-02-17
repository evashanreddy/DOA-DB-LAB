package com.company.DOADB;

import java.util.*;

public class StudentImplementation implements IStudents
{
	
	private List <Students> student;
	
	public StudentImplementation()
	{
		student = new ArrayList<Students>();
	}

	public void addStudents(Students stuAdd)
	{
		student.add(stuAdd);
	}

	public List<Students> getAllStudents()
	{
		return student;
	}

	public void updateStudents(Students stuUpd)
	{
		student.get(stuUpd.getId()).setName(stuUpd.getName());
		System.out.println("Student Number: "+stuUpd.getId()+" is updated in the database.");
		
	}

	public void deleteStudents(int id)
	{
		student.remove(id);
		
		System.out.println("Student Number: "+id+" is removed from database.");
	}

}

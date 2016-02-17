package com.company.DOADB;


import java.util.*;

public interface IStudents
{

	public void addStudents(Students stuAdd); //create
	public List <Students> getAllStudents(); //read
	public void updateStudents(Students stuUpd); //update
	public void deleteStudents(int id); //delete	
	
	
}

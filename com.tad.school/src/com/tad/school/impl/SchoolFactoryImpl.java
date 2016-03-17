package com.tad.school.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.tad.school.Academy;
import com.tad.school.School;
import com.tad.school.Teacher;
import com.tad.school.ClassRoom;
import com.tad.school.Student;
import com.tad.school.Matter;
import com.tad.school.Math;
import com.tad.school.Notation;
import com.tad.school.SchoolFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class SchoolFactoryImpl extends MSchoolFactoryImpl implements SchoolFactory
{
	
	public static SchoolFactory init() {
		
		try {
			Object fact = MSchoolFactoryImpl.init();
			if ((fact != null) && (fact instanceof SchoolFactory))
					return (SchoolFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchoolFactoryImpl(); 
		 }
	
	public Academy createAcademy()
	{
		Academy result = new AcademyImpl();
		return result;
	}
	public School createSchool()
	{
		School result = new SchoolImpl();
		return result;
	}
	public Teacher createTeacher()
	{
		Teacher result = new TeacherImpl();
		return result;
	}
	public ClassRoom createClassRoom()
	{
		ClassRoom result = new ClassRoomImpl();
		return result;
	}
	public Student createStudent()
	{
		Student result = new StudentImpl();
		return result;
	}
	public Matter createMatter()
	{
		Matter result = new MatterImpl();
		return result;
	}
	public Math createMath()
	{
		Math result = new MathImpl();
		return result;
	}
	public Notation createNotation()
	{
		Notation result = new NotationImpl();
		return result;
	}
}

package com.tad.school;

import com.tad.school.impl.SchoolFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface SchoolFactory extends MSchoolFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	SchoolFactory eINSTANCE = SchoolFactoryImpl.init();
				
	public Academy createAcademy();
	public School createSchool();
	public Teacher createTeacher();
	public ClassRoom createClassRoom();
	public Student createStudent();
	public Matter createMatter();
	public Math createMath();
	public Notation createNotation();
}

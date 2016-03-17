package com.tad.shool.genhtml.test;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicMonitor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tad.school.Academy;
import com.tad.school.School;
import com.tad.school.SchoolFactory;
import com.tad.school.Student;
import com.tad.school.genhtml.main.GenerateHtml;

public class TestGenerateHTML {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Academy academy;

	@Before
	public void setUp() throws Exception {
		academy = SchoolFactory.eINSTANCE.createAcademy();
		academy.setName("TAD");
		
		Student student = SchoolFactory.eINSTANCE.createStudent();
		student.setName("Tony");
		student.setAge(39);
		
		academy.getStudents().add(student);
	}

	@After
	public void tearDown() throws Exception {
		File file = new File("/tmp/TAD.html");
		file.delete();
	}

	@Test
	public void testDoGenerate() {
		try {
			GenerateHtml generateHtml = new GenerateHtml(academy, new File("/tmp"), Collections.emptyList());
			generateHtml.doGenerate(new BasicMonitor());
			
			Assert.assertTrue(new File("/tmp/TAD.html").exists());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

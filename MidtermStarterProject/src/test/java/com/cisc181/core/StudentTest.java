package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class StudentTest {
	
	ArrayList<Student> ListofStudents = new ArrayList<Student>();
	
	@BeforeClass{
	
	ListofStudents.add(new Student( "Lucia",  "Evelyn",  "Malvoni", 1995.07.28, eMajor.PHYSICS,
			 "123 Central Ave", "5163028976", "lm@gmail.com"));  
	}
	@Test
	public void testChangeMajor() {
		Student random = ListofStudents[0];
		random.setMajor(eMajor.NURSING);
		assertEquals(random.getMajor(),eMajor.NURSING);
	}

}

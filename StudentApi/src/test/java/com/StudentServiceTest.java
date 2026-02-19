package com;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

	StudentService service;

	@BeforeEach
	void setUp() {
		service = new StudentService();
	}

	@Test
	void testAddStudent() {
		service.addStudent("Ravi");
		assertEquals(1, service.getStudentCount());
	}

	@Test
	void testMultipleStudents() {
		service.addStudent("Ravi");
		service.addStudent("Anita");
		assertEquals(2, service.getStudentCount());
	}
}
package com;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

	StudentRepository repository;
	StudentService service;

	@BeforeEach
	void setUp() {
		repository = Mockito.mock(StudentRepository.class);
		service = new StudentService(repository);
	}

	@Test
	void testAddStudent() {
		service.addStudent("Ravi");
		verify(repository).save("Ravi");
	}

	@Test
	void testStudentCount() {
		when(repository.count()).thenReturn(5);
		int count = service.getStudentCount();
		assertEquals(5, count);
	}
	
}
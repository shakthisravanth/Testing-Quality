package com;

public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public void addStudent(String name) {
		repository.save(name);
	}

	public int getStudentCount() {
		return repository.count();
	}
}
package com;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

	private List<String> students = new ArrayList<>();

	public void addStudent(String name) {
		students.add(name);
	}

	public int getStudentCount() {
		return students.size();
	}
}
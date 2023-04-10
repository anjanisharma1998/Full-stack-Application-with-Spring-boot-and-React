package com.anjani.studentsystem.service;

import java.util.List;

import com.anjani.studentsystem.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}

package ke.kigen.studentmanagementsystem.service;

import java.util.List;

import ke.kigen.studentmanagementsystem.entity.Student;

public interface StudentService {
    
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}

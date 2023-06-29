package ke.kigen.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ke.kigen.studentmanagementsystem.entity.Student;
import ke.kigen.studentmanagementsystem.repository.StudentRespository;
import ke.kigen.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRespository studentRespository;

    @Override
    public List<Student> getAllStudents() {
        return studentRespository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRespository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRespository.deleteById(id);
    }

}

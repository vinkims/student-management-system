package ke.kigen.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ke.kigen.studentmanagementsystem.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long> {
    
}

package ke.kigen.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ke.kigen.studentmanagementsystem.entity.Student;
import ke.kigen.studentmanagementsystem.repository.StudentRespository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRespository studentRespository;

	@Override
	public void run(String... args) throws Exception {

		// Student student1 = new Student("Vincent", "Kigen", "vincentkigen@gmail.com");
		// studentRespository.save(student1);

		// Student student2 = new Student("Jeremy", "Kiptoo", "jeremykiptoo@gmail.com");
		// studentRespository.save(student2);

		// Student student3 = new Student("Rosemary", "Njenga", "rosemarynjenga@gmail.com");
		// studentRespository.save(student3);
	}

}

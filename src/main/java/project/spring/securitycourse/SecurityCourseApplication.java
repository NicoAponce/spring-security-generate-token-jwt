package project.spring.securitycourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.spring.securitycourse.entities.User;
import project.spring.securitycourse.repositories.UserRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SecurityCourseApplication {

	@Autowired
	private UserRepository userRepository;
	User user1= User.builder()
			.username("nicolas")
			.password("1234")
			.email("nicolas@gmail.com")
			.build();

	User user2= User.builder()
			.username("dyana")
			.password("1234")
			.email("dyana@gmail.com")
			.build();

	@PostConstruct
	public void initUsers(){
		userRepository.save(user1);
		userRepository.save(user2);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityCourseApplication.class, args);
	}

}

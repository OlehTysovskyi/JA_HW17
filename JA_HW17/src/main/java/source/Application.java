package source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import source.domain.University;
import source.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);

		University university = new University();
		university.setName("Ivan Franko Lviv National University");
		university.setAccreditationLevel(3);
		university.setInstitutes(25);
		university.setStudents(21320);
		university.setAddress("University Street, 1, Lviv, Ukraine");

		service.save(university);
		System.out.println(service.findById((long) 1));
		
		University universityForUpdate = service.findById((long) 1);
		universityForUpdate.setInstitutes(28);
		universityForUpdate.setStudents(23501);
		service.update(universityForUpdate);
		System.out.println(service.findById((long) 1));

		service.deleteById((long) 1);

	}

}

package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		User test = new User();
		test.setName("Gabriel");
		test.setUsername("gabriel123");
		test.setPassword("123");
		
		repository.save(test);
		
		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}

}

package dio.aula;

import java.util.List;

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
		//List<User> users = repository.filtrarPorNome("Gabriel");
		List<User> users = repository.findByNameContaining("Gabriel");
		for(User u: users) {
			System.out.println(u);
		}
	}
	
	private void insertUser() {
		User test = new User();
		test.setName("Gabriel Rodrigues");
		test.setUsername("gabriel123");
		test.setPassword("123");
		
		repository.save(test);
		
		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}

}

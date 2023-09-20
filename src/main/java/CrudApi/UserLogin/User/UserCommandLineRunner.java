package CrudApi.UserLogin.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserRepository repository;
//    private Logger logger= LoggerFactory.getLogger(getClass());

    public UserCommandLineRunner(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Userdetails(1,"divya","divya@gmail.com","intern"));
        repository.save(new Userdetails(2,"sanskar","sanskar@gmail.com","intern"));
        repository.save(new Userdetails(3,"isra","isra@gmail.com","intern"));

        System.out.println(repository.findById(1l));

    }


}

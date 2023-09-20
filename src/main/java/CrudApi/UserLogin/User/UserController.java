package CrudApi.UserLogin.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

   private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/view",method = RequestMethod.GET)
   public List<Userdetails> view(){
     List<Userdetails> user= repository.findAll();
     return user;
   }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody Userdetails newUser){
        String email= newUser.getEmail();
        if(email.contains("@")) {
            repository.save(newUser);
        }else{
            return "enter valid email";
        }
        return "Succesfully entered details";
    }
}

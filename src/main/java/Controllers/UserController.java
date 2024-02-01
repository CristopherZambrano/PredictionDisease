package Controllers;

import Models.User;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Controller
public class UserController {

    public List<User> getUsers(){
        return List.of(
          new User(
                  91L,
                  "120702400-9",
                  "Cris",
                  "Zambrano",
                  "StivZambrano00@gmail.com",
                  "12345678",
                  LocalDate.of(2000, Month.JUNE,3),
                  "Male",
                  "Quevedo",
                  "0968569277"
          )
        );
    }

}

package Service;

import Modellor.Register.Register;
import Modellor.User.User;

import java.util.*;

public class RegisterService {

    List<Register> registeredusers=new ArrayList<>();
    public void registerCrendials(User user, String userName, String password)
    {
     Register crendials = new Register(user,userName,password);
     registeredusers.add(crendials);
     System.out.println("User Registered Successfully");
    }
    public boolean login(User user, String username, String password)
    {
        if(registeredusers!=null)
        {
            for(Register crendials:registeredusers)
            {
                if(crendials.getUser().equals(user)&&crendials.getPassword().equals(password)&&crendials.getUsername().equals(username))
                {
                    return true;
                }
            }
        }
        return false;
    }
}

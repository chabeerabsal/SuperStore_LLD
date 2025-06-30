package Service;

import Modellor.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<String,User>();
    private int count=0;

    public void registerUser(User user) {
         String s1 ="T"+count++;
        users.put(s1,user);

    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}

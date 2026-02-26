
package pos;

import pos.dao.UserDao;
import pos.model.User;

public class POS {

    public static void main(String[] args) {
    
        
        User u =new User("abul", "1234");
        UserDao dao = new UserDao();
        dao.saveUser(u);
           
    }
    
}

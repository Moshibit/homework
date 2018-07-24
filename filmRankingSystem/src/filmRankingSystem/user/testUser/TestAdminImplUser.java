/**
 * create: 19/07/2018
 */
package filmRankingSystem.user.testUser;

import filmRankingSystem.user.adminImplUser.AdminImplUser;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class TestAdminImplUser
{

    /**
     * 
     */
    public TestAdminImplUser()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    {
    		UserDTO user_1 = new UserDTO("Victor", "Guerrero", "Sanchez",
    			"YoSoyVictor11", "victor@gmail.com", "pepito11");
            
            UserDTO user_2 = new UserDTO("Victor2", "Guerrero", "Sanchez",
        			"YoSoyVictor22", "victor2@gmail.com", "pepito22");
            
            UserDTO user_3 = new UserDTO("Victor3", "Guerrero", "Sanchez",
        			"YoSoyVictor33", "victor3@gmail.com", "pepito33");
            
            UserDTO user_4 = new UserDTO("Victor4", "Guerrero", "Sanchez",
        			"YoSoyVictor44", "victor4@gmail.com", "pepito44");
            
            UserDTO user_5 = new UserDTO("Victor5", "Guerrero", "Sanchez",
        			"YoSoyVictor55", "victor5@gmail.com", "pepito55");
            
            UserDTO user_6 = new UserDTO("Victor6", "Guerrero", "Sanchez",
        			"YoSoyVictor66", "victor6@gmail.com", "pepito66");
            
            AdminImplUser myAdminUser = new AdminImplUser();
            
            //ADD
            myAdminUser.addUser(user_3);
            myAdminUser.addUser(user_2);
            myAdminUser.addUser(user_1);
            myAdminUser.addUser(user_6);
            myAdminUser.addUser(user_5);
            myAdminUser.addUser(user_4);
            
            //SEARCH
            myAdminUser.searchUser("Victor");
            
            //UPDATE NICK NAME
            myAdminUser.ChageUserName("YoSoyVictor66", "YoPedrito777");
            myAdminUser.ChangeUserPass("pepito44", "pepito_nuevo");
            myAdminUser.ChangeUserMail("victor5@gmail.com", "nuevo_mail@gmail.com");
    }
    
}

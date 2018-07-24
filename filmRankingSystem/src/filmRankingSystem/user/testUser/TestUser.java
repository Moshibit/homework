/**
 * create: 19/07/2018
 */
package filmRankingSystem.user.testUser;

import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class TestUser
{

    /**
     * 
     */
    public TestUser()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        UserDTO user_1 = new UserDTO("Victor", "Guerrero", "Sanchez",
			"YoSoyVictor11", "victor@gmail.com", "pepito25");
        
        UserDTO user_2 = new UserDTO("Victor2", "Guerrero", "Sanchez",
    			"YoSoyVictor22", "victor2@gmail.com", "pepito00");
        
        UserDTO user_3 = new UserDTO("Victor3", "Guerrero", "Sanchez",
    			"YoSoyVictor33", "victor3@gmail.com", "pepito00");

    }

}

/**
 * create: 19/07/2018
 */
package filmRankingSystem.user.adminUser;

import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public interface AdminUser
{
	public boolean addUser(UserDTO user_a);
	public void searchUser(String user_s);
	public void ChageUserName(String user_c1, String user_c2); //user_c1 -> usuario actual y user_c2 -> nuevo nombre de usuario
	public void ChangeUserPass(String password, String passwordN);
	public void ChangeUserMail(String Mail, String MailN);
}

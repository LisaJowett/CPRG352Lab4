package ca.sait.cprg352.lab4.services;

import ca.sait.cprg352.lab4.problemdomain.User;

/**
 *
 * @author Lisa Jowett
 */
public class AccountService 
{
    public User login(String username, String password)
    {
        if(username.equals("abe") && password.equals("password"))
        {
            return new User(username, null);
        }
        else if (username.equals("barb") && password.equals("password"))
        {
            return new User(username, null);
        }
        else
        {
            return null;
        }
    }
}

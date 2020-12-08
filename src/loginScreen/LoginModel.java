package loginScreen;

public class LoginModel
{
    private String name;
    private String password;

    public LoginModel()
    {
        name="name";
        password="password";
    }

    public boolean comparelogin(String inputName, String inputPassword)
    {
        if(inputName.equals(name) && inputPassword.equals(password))
        {
            return true;
        }
        else
        {
            System.out.println("false username or password");
            return false;
        }
    }

}

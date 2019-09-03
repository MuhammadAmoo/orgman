package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser()
    {
        User user = UserFactory.buildUser(
                "muhammad.softlite@gmail.com",
                "Muhammad",
                "Amoo");

        assertNotNull(user);
        //Displays the object created
        System.out.println("User details: " + "\n" + user);
    }
}
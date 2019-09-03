package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole()
    {
        UserRole userRole = UserRoleFactory.buildUserRole(
                 "OF",
                 "muhammad.softlite@gmail.com",
                 "RF");

        assertNotNull(userRole);
        //Displays the object created
        System.out.println("User details: " + "\n" + userRole);
    }
}
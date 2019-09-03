package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() throws ParseException {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("1997-05-23");

        UserDemography userDemography = UserDemographyFactory.buildUserDemography(
                "muhammad.softlite@gmail.com" + "\n",
                "Manager" + "\n",
                "GF" + "\n",
                "RF" + "\n",
                 date);

        assertNotNull(userDemography);
        //Displays the object created
        System.out.println("User details: " + "\n" + userDemography);
    }
}
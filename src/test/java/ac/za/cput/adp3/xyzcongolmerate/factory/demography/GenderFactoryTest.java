package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GenderFactoryTest {

    @Test
    public void buildGender()
    {
        Gender gender = GenderFactory.buildGender("male");
        assertNotNull(gender.getGenderId());
        //Displays whether the ID has been generated
        System.out.println("The ID generated: "+ gender.getGenderId());
    }
}
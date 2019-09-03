package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser()
    {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser
        (
                "OF-98d31dc0-7a0e-4822-b944-ff49b0853055",
                "muhammad.softlite@gmail.com"
        );
        assertNotNull(organisationUser);
        //Displays the object created
        System.out.println("User Organisation details: " + "\n" + organisationUser);


    }
}
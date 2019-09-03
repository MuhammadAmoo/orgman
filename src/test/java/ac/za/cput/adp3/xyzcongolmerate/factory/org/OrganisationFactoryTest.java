package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation()
    {
        Organisation organisation = OrganisationFactory.buildOrganisation("Softlite");
        assertNotNull(organisation.getOrgCode());
        //Displays whether the ID has been generated
        System.out.println("The ID generated: "+organisation.getOrgCode());
    }
}
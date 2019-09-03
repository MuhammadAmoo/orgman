package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("coloured");
        assertNotNull(race.getRaceId());
        //Displays whether the ID has been generated
        System.out.println("The ID generated: " + race.getRaceId());
    }
}
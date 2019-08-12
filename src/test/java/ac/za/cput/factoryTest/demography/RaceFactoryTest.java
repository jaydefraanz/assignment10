package ac.za.cput.factoryTest.demography;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("White");
        String theRace = race.getDesc();
        Assert.assertEquals(race.getDesc(),theRace);
    }
}
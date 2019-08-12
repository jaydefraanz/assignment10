package ac.za.cput.domainTest.demography;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    Race race = RaceFactory.buildRace("Black");

    @Test
    public void getRaceId() {
        Assert.assertNotNull(race.getRaceId());
    }

    @Test
    public void getDesc() {
        Assert.assertNotNull(race.getDesc());
    }

    @Test
    public void setRaceId() {
        Assert.assertNotNull(race.getRaceId());
    }

    @Test
    public void setDesc() {
        Assert.assertNotNull(race.getDesc());
    }
}
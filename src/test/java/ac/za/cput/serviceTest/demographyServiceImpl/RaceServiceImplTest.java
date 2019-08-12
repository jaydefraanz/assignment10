package ac.za.cput.serviceTest.demographyServiceImpl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.service.demography.RaceService;
import ac.za.cput.service.demography.impl.RaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception{
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll()
    {
        Set<Race> raceSet = service.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        Race race = RaceFactory.buildRace("Male");
        Race race2 = RaceFactory.buildRace("Female");

        service.create(race);
        service.create(race2);

        //Race readRace = service.read(race.getDesc());

        Assert.assertNotSame(race.getDesc(),race2.getDesc());
    }

    @Test
    public void update() {
        Race race = RaceFactory.buildRace( "Female");
        Race race2 = RaceFactory.buildRace("Male");

        race2.setRaceId(race.getRaceId());
        service.create(race);

        service.update(race2);

        Assert.assertNotEquals(race.getDesc(), race2.getDesc());
    }

    @Test
    public void delete() {
        Race race = RaceFactory.buildRace( "Male");
        service.create(race);
        Race readRace1 = service.read(race.getRaceId());
        Assert.assertTrue(this.service.getAll().size() > 0);
        service.delete(readRace1.getRaceId());
        Assert.assertTrue(this.service.getAll().size() >0);
    }

    @Test
    public void read() {
        Race race = RaceFactory.buildRace( "Male");
        service.create(race);
        Race readRace1 = service.read(race.getRaceId());
        Assert.assertNotNull(readRace1);
    }
}
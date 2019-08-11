package ac.za.cput.repositoryTest.demographyRepositoryImpl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceRepositoryImplTest {

    public RaceRepositoryImpl repository;

    @Before
    public void setUp() throws Exception{
        repository = RaceRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Race> raceSet = this.repository.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        Race race = RaceFactory.buildRace("coloured");
        this.repository.create(race);

        //Race readRace = repository.read(race.getRaceId());

        Assert.assertTrue(this.repository.getAll().size() > 0);
    }

    @Test
    public void update() {
        Race race = RaceFactory.buildRace("black");
        this.repository.create(race);

        Race updateRace = RaceFactory.buildRace("white");

        updateRace.setRaceId(race.getRaceId());
        repository.update(updateRace);
        //Race readRace = repository.read(race.getRaceId());

        Assert.assertNotEquals(race.getDesc(),updateRace.getDesc());
    }

    @Test
    public void delete() {
        Race race = RaceFactory.buildRace("white");
        this.repository.create(race);

        Race readRace = repository.read(race.getRaceId());
        this.repository.delete(readRace.getRaceId());


        Assert.assertTrue(this.repository.getAll().size() ==1);

    }

    @Test
    public void read() {

        Race race = RaceFactory.buildRace("coloured");
        this.repository.create(race);

        Race readRace = repository.read(race.getRaceId());

        Assert.assertNotNull(readRace);
    }
}
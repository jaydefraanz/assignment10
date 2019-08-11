package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;
    private Set<Race> races;

    private RaceRepositoryImpl()
    {
        this.races = new HashSet<>();
    }

    public static RaceRepositoryImpl getRepository()
    {
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
        Race updateRace = read(race.getRaceId());

        if(updateRace != null)
        {
            this.races.remove(updateRace);
            this.races.add(race);
        }

        return race;
    }

    @Override
    public void delete(String s) {
        Race e = read(s);
        if(e != null)
        {
            this.races.remove(e);
        }
    }

    @Override
    public Race read(String s) {
        return this.races.stream().filter(e -> e.getRaceId().equals(s)).findAny()
                .orElse(null);
    }
}

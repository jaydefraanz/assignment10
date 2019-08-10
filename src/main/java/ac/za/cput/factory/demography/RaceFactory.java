package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.util.Misc;

public class RaceFactory {

    public static Race buildRace(String gender)
    {
        return new Race.Builder().raceId(Misc.generateId())
                .desc(gender)
                .build();
    }
}

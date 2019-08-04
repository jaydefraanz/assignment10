package ac.za.cput.domain.demography;

public class Race {
    private String raceId, raceName;

    private Race(){}

    public Race(Builder builder)
    {

    }

    public String getRaceId(){return raceId;}

    public String getRaceName(){return raceName;}

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "raceId='" + raceId + '\'' +
                ", raceName='" + raceName + '\'' +
                '}';
    }

    public class Builder{
        private String raceId, raceName;

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public Builder raceName(String raceName)
        {
            this.raceName = raceName;
            return this;
        }

        public Race build(){return new Race(this);}
    }
}

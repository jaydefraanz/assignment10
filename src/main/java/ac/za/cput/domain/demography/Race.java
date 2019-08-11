package ac.za.cput.domain.demography;

public class Race {
    private String raceId, desc;

    private Race(){}

    public Race(Builder builder)
    {
        this.raceId = builder.raceId;
        this.desc = builder.desc;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getDesc() {
        return desc;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class Builder{
        private String raceId, desc;

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public Builder desc(String desc)
        {
            this.desc = desc;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }
    }
}

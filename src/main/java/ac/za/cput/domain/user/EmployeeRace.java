package ac.za.cput.domain.user;

import javafx.util.Builder;

public class EmployeeRace {

    private String employeeNumber, raceId;

    private EmployeeRace(){}

    public EmployeeRace(Builder builder)
    {
        
    }

    public String getEmployeeNumber(){return employeeNumber;}

    public String getRaceId(){return raceId;}

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public class Builder{
        private String employeeNumber, raceId;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build(){return new EmployeeRace(this);}
    }
}

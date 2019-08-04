package ac.za.cput.domain.demography;

public class Gender {
        private String genderId, genderName;

        private Gender(){}

        public Gender(Builder builder)
        {

        }

        public String getGenderId(){return genderId;}

        public String getGenderName(){return genderName;}

        @Override
        public String toString() {
                return "EmployeeGender{" +
                        "genderId='" + genderId + '\'' +
                        ", genderName='" + genderName + '\'' +
                        '}';
        }

        public class Builder{
                private String genderId, genderName;

                public Builder genderId(String genderId)
                {
                        this.genderId = genderId;
                        return this;
                }

                public Builder genderName(String genderName)
                {
                        this.genderName = genderName;
                        return this;
                }

                public Gender build(){return new Gender(this);}
        }
}

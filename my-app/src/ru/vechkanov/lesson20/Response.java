package ru.vechkanov.lesson20;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String status;
    private String country;
    private String countryCode;

    public Response() {
    }

    public String getStatus() {
        return status;
    }



    public String getCountry() {
        return country;
    }



    public String getCountryCode() {
            return countryCode;
        }



        @Override
        public String toString () {
            return "Response{" +
                    "status='" + this.getStatus() + '\'' +
                    ", country='" + this.getCountry() + '\'' +
                    ", countryCode='" + this.getCountryCode() + '\'' +
                    '}';
        }
    }


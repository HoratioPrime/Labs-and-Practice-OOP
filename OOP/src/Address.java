import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartment;

    private String token = ",";

    public void parseStringIntoAddr(String str)
    {
        StringTokenizer st = new StringTokenizer(str, token);
        //String [] addr = str.split(token);
        country = deleteSpacesFromBegAndEnd(st.nextToken());
        region = deleteSpacesFromBegAndEnd(st.nextToken());
        city = deleteSpacesFromBegAndEnd(st.nextToken());
        street = deleteSpacesFromBegAndEnd(st.nextToken());
        house = deleteSpacesFromBegAndEnd(st.nextToken());
        housing = deleteSpacesFromBegAndEnd(st.nextToken());
        apartment = deleteSpacesFromBegAndEnd(st.nextToken());

    }

    public void setToken(String token){
        this.token = token;
    }

    private String deleteSpacesFromBegAndEnd(String str)
    {
        if(str.charAt(0) == ' '){
            str = str.substring(1);
        }
        if(str.charAt(str.length()-1) == ' '){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}

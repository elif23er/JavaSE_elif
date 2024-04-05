package week04.entityrelations.composition.aggregation;

public class Address {
    private final String streat;

    private final String city ;


    @Override
    public String toString() {
        return "Address{" +
                "streat='" + streat + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(String street , String city){
        this.streat = street;
        this.city = city;




    }
}

package week04.entityrelations.composition;

import week04.entityrelations.composition.aggregation.Address;

public class CompositeEmployee {
    private final int id;

    private final String name;

    private final Address address;

    public CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street,city);


    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Adress {
        private final String streat;

        private final String city;


        @Override
        public String toString() {
            return "Address{" +
                    "streat='" + streat + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        public Adress(String street, String city) {
            this.streat = street;
            this.city = city;
        }
    }
}

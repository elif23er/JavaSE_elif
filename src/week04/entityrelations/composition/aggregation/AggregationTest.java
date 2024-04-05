package week04.entityrelations.composition.aggregation;

public class AggregationTest {

    public static void main(String[] args) {


       // Address address = new Address("2037", "Ankara");
        //System.out.println(address);

        AggregateEmployee employee=new AggregateEmployee(1,"Alperen", new Address("2037","Ankara"));
        System.out.println(employee);
    }
}

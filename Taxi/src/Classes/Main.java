package Classes;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

    Ticket ticket = new Ticket("Washington","New York",new Date(2022,03,20,16,45,34),true,1.4f,"USA");
    Driver driver = new Driver();
    Company company = new Company("Uber");
    Car car = new Car("CE1923KA","Chevrolet",Type.SEDAN);

    ticket.addDriver(19,"Jake","Salami",new Date(1987,05,19),10000,2.4f,true);
    System.out.print(ticket.toString());
    ticket.removeDriver(0);
    System.out.print(ticket.toString());


    }
}

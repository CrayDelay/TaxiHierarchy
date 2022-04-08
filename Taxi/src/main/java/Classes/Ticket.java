package Classes;

import Exceptions.PriceException;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Date;

public class Ticket extends Order implements ICheckClient, ITaxiType {
    private float PricePerKm;
    private String Country;
    private float price;
    private ArrayList<Driver> drivers = new ArrayList<Driver>();
    private ArrayList<Client> clients = new ArrayList<Client>();
    public static Logger LOGGER = Logger.getLogger(Ticket.class);

    public Ticket(String name, String pointA, String pointB, Date OrderTime, boolean Luggage, float PricePerKm, String Country) {
        super(name, pointA, pointB, OrderTime, Luggage);
        this.PricePerKm = PricePerKm;
        this.Country = Country;
    }

    public Ticket() {
    }

    public float getPricePerKm() {
        return PricePerKm;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public void setPricePerKm(float PricePerKm) throws Exception {
        if (PricePerKm <= 0) {
            throw new Exception("Value can not be 0 or less!");
        } else {
            this.PricePerKm = PricePerKm;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws PriceException {
        if (price <= 0) {
            throw new PriceException("Value can not be 0 or less!");
        } else {
            this.price = price;
        }
    }

    public String toString() {
        return
                "Country:" + Country + "\n"
                        + "Price:" + price + "\n"
                        + "Starting Point:" + super.getPointA() + "\n"
                        + "Ending Point:" + super.getPointB() + "\n"
                        + "Order Time:" + super.getOrderTime() + "\n"
                        + "Luggage:" + super.isLuggage() + "\n";
    }

    public void addDriver(int age, String name, String surname, Date birthday, int wage, float experience, boolean available) {
        Driver driver = new Driver(age, name, surname, birthday, wage, experience, available);
        drivers.add(driver);
    }

    public void removeDriver(int index) {
        drivers.remove(drivers.get(index));
    }

    public void addClient(int age, String name, String surname, boolean VIP, boolean Premium, boolean Golden) {
        Client client = new Client(age, name, surname, VIP, Premium, Golden);
        clients.add(client);
    }

    public void removeClient(int index) {
        clients.remove(clients.get(index));
    }


    @Override
    public double CheckStatus(ArrayList<Client> clients, int index) {

        if ((clients.get(index).isVIP())) {
            return PricePerKm = PricePerKm / 0.2f;
        } else if ((clients.get(index).isPremium())) {
            return PricePerKm = PricePerKm / 0.4f;
        } else if ((clients.get(index).isGolden())) {
            return PricePerKm = PricePerKm / 0.8f;
        }
        return PricePerKm;
    }
    @Override
    public double TaxiType()
    {
        if(Economy){
            price=price/0.5f;
        }
        else if(WithAmenities){
            price=price*0.5f;
        }
        return price;
    }


}


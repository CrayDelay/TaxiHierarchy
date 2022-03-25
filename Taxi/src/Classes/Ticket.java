package Classes;
import java.util.ArrayList;
import java.util.Date;

public abstract class Ticket extends Order implements IClientCheck
{
    private float price_per_km;
    private String Country;
    private float price;
    private  ArrayList<Driver> drivers = new ArrayList<Driver>();
    private  ArrayList<Client> clients =new ArrayList<Client>();



    public  Ticket(String point_A,String point_B,Date OrderTime,boolean Luggage,float _price_per_km, String _Country)
    {
        super(point_A, point_B, OrderTime,Luggage);
        this.price_per_km=price_per_km;
        this.Country=_Country;
    }

    public Ticket(){};
    public float getPrice_per_km() {
        return price_per_km;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPrice_per_km(float price_per_km) {
        this.price_per_km = price_per_km;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString()
    {
        return
                "Country:" + Country +"\n"
                +"Price:" + price +"\n"
                +"Starting Point:" + super.getPoint_A() +"\n"
                +"Ending Point:" + super.getPoint_B() +"\n"
                +"Order Time:" + super.getOrderTime() +"\n"
                +"Luggage:" + super.isLuggage() +"\n";
    }

    public  void addDriver(int age,String name,String surname,Date birthday, int wage, float experience,boolean available)
    {
        Driver driver= new Driver(age,name,surname,birthday,wage,experience,available);
        drivers.add(driver);
    }

    public  void removeDriver(int index)
    {
        drivers.remove(drivers.get(index));
    }

    public void addClient(int age,String name,String surname,boolean VIP,boolean Premium, boolean Golden )
    {
        Client client = new Client(age,name,surname,VIP,Premium,Golden);
        clients.add(client);
    }
    public void removeClient(int index)
    {
        clients.remove(clients.get(index));
    }




    //@Override
    public double CheckStatus(ArrayList<Client> clients, int index)
    {

            if( (clients.get(index).isVIP())) {
                return price_per_km = price_per_km / 0.2f;
            }
            else if ((clients.get(index).isPremium())) {
                return price_per_km = price_per_km / 0.4f;
            }
            else if ((clients.get(index).isGolden())){
                return price_per_km = price_per_km/0.8f;
            }
            return price_per_km;
        }

}


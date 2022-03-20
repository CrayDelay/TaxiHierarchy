package Classes;
import java.util.Date;
public class Ticket extends Order
{
    private float price_per_km;
    private String Country;
    private float price;

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
}

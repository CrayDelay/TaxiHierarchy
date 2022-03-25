package Classes;
import java.time.LocalTime;
import java.util.Date;

public class Client extends Person
{
    private boolean VIP;
    private boolean Premium;
    private boolean Golden;

    public Client(){};

    public Client(int age,String name,String surname,boolean VIP,boolean Premium, boolean Golden )
    {
        super(age, name, surname);
        this.VIP=VIP;
        this.Premium=Premium;
        this.Golden=Golden;
    }

    public boolean isGolden() {
        return Golden;
    }

    public void setGolden(boolean golden) {
        Golden = golden;
    }

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean premium) {
        Premium = premium;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }


}

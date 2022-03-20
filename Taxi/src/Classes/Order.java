package Classes;
import java.util.Date;

public abstract class Order
{
    private String point_A;
    private String point_B;
    private Date   OrderTime;
    private boolean Luggage;

    public Order(){};

    public Order(String point_A,String point_B,Date OrderTime,boolean Luggage)
    {
        this.point_A=point_A;
        this.point_B=point_B;
        this.OrderTime=OrderTime;
        this.Luggage=Luggage;
    }
    public String getPoint_A() {
        return point_A;
    }

    public void setPoint_A(String point_A) {
        this.point_A = point_A;
    }

    public void setPoint_B(String point_B) {
        this.point_B = point_B;
    }

    public String getPoint_B() {
        return point_B;
    }

    public Date getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Date orderTime) {
        OrderTime = orderTime;
    }

    public boolean isLuggage() {
        return Luggage;
    }

    public void setLuggage(boolean luggage) {
        Luggage = luggage;
    }
}

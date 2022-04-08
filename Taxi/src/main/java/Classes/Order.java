package Classes;


import java.util.Date;

public class Order extends Company {
    private String pointA;
    private String pointB;
    private Date OrderTime;
    private boolean Luggage;


    public Order() {
    }


    public Order(String name, String pointA, String pointB, Date OrderTime, boolean Luggage){
        super(name);
        this.OrderTime = OrderTime;
        this.Luggage = Luggage;
        this.pointA = pointA;
        this.pointB = pointB;

    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public String getPointB() {
        return pointB;
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

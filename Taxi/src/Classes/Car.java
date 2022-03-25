package Classes;


public  class Car
{

    private String carId;
    private String model;
    private Type type;

    public Car(String carId , String model,Type type)
    {
        this.carId = carId;
        this.model = model;
        this.type=type;
    }

    public Car(){};

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String toString()
    {
    return
            "Car ID:" + carId +"\n"
            +"Model:" + model +"\n"
            +"Type:" + type +"\n";
    }

    public final void Drive()
    {
        System.out.println("You are going");
    }

}




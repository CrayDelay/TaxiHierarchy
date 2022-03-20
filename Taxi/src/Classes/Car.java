package Classes;


public abstract class Car
{

    private String carId;
    private String model;
    private Type type;

    public Car(String _carId , String _model,Type type)
    {
        this.carId = _carId;
        this.model = _model;
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
    return "Car ID:" + this.carId +" Model:" + this.model;
}

}




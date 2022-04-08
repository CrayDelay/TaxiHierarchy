package Classes;

import Enums.Type;
import org.apache.log4j.Logger;

public abstract class Car {
    public static Logger LOGGER = Logger.getLogger(Car.class);
    private String carId;
    private String model;
    private Type type;

    public Car(String carId, String model, Type type) {
        this.carId = carId;
        this.model = model;
        this.type = type;
    }

    public Car() {
    }


    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) throws Exception {
        if (carId.length() <= 8) {
            throw new Exception("Value must be equal or less than 8");
        } else {
            this.carId = carId;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String toString() {
        return
                "Car ID:" + carId + "\n"
                        + "Model:" + model + "\n"
                        + "Type:" + type + "\n";
    }

    public final void Drive() {
        LOGGER.info("You are going");
    }

}




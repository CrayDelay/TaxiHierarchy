package Classes;

import org.apache.log4j.Logger;

import java.util.ArrayList;
public class Dispatcher extends Employee {
    private ArrayList<Driver> drivers = new ArrayList<Driver>();
    public static Logger LOGGER = Logger.getLogger(Dispatcher.class);
    public void getCall(ArrayList<Driver> drivers, int index) {
        if (drivers.get(index).isAvailable()) {
            LOGGER.info("Driver is on the way");
        } else {
            LOGGER.info("Driver is unreachable");
        }
    }

}

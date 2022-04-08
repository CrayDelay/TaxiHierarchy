package Classes;

import Exceptions.DriverExperienceException;
import org.apache.log4j.Logger;

import java.util.Date;


public class Main {

    public static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws DriverExperienceException {

        Ticket ticket = new Ticket();
        Driver driver = new Driver();

        ticket.addDriver(19, "Jake", "Salami", new Date(1987, 05, 19), 10000, 2.4f, true);

    
    }
}

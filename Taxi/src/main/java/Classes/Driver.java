package Classes;

import Exceptions.DriverExperienceException;

import java.util.Date;

public class Driver extends Employee implements IDriver {
    private double experience;
    private boolean available;

    public Driver() {
    }



    public Driver(int age, String name, String surname, Date birthday, double wage, double experience, boolean available) {
        super(age, name, surname, birthday, wage);
        this.experience = experience;
        this.available = available;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) throws DriverExperienceException {
         if(experience > 100){
            throw new DriverExperienceException("Experience can't be more than 100");
        }else{
            this.experience = experience;
        }

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return
                "Name:" + super.getName() + "\n"
                        + "Surname:" + super.getSurname() + "\n";
    }
    @Override
    public double Career()
    {
        double wage = 0;
        if(experience>0.6){
            wage=getWage()*1.2;
        }else if(experience>=1 && experience<=2){
            wage=getWage()*1.5;
        }else if(experience >= 2){
            wage=getWage()*2;
        }

        return setWage(wage);
    }

}


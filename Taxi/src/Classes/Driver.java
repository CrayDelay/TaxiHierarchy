package Classes;

import java.util.Date;

public class Driver extends Employee
{
    private int experience;
    private boolean available;

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setReady(boolean ready) {
        this.available = ready;
    }

    public Driver(int age,String name,String surname,Date birthday, int wage, int experience,boolean available)
    {
        super(age, name, surname, birthday, wage);
        this.experience=experience;
        this.available=available;
    }


}


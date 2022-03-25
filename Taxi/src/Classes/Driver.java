package Classes;

import java.util.Date;

public class Driver extends Employee
{
    private float experience;
    private boolean available;

    public Driver(){};

    public Driver(int age,String name,String surname,Date birthday, int wage, float experience,boolean available)
    {
        super(age, name, surname, birthday, wage);
        this.experience=experience;
        this.available=available;
    }

    public float getExperience() {
        return experience;
    }
    public void setExperience(float experience) {
        this.experience = experience;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setReady(boolean ready) {
        this.available = ready;
    }

    public String toString()
    {
        return
                "Name:" + super.getName() +"\n"
                +"Surname:" + super.getSurname() +"\n";
    }


}


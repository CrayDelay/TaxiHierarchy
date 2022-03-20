package Classes;

import java.util.Date;

public class Employee extends Person
{
    private Date birthday;
    private int wage;

    public Employee(int age,String name,String surname ,Date birthday,int wage)
    {
        super(age, name, surname);
        this.birthday=birthday;
        this.wage=wage;
    }


    public Employee(){};


    public Date getBirthday() {
        return birthday;
    }
    public int getWage() {
        return wage;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }



}

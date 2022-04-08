package Classes;

import java.util.Date;

public class Employee extends Person {
    private Date birthday;
    private double wage;

    public Employee(int age, String name, String surname, Date birthday, double wage) {
        super(age, name, surname);
        this.birthday = birthday;
        this.wage = wage;
    }


    public Employee() {
    }

    ;


    public Date getBirthday() {
        return birthday;
    }

    public double getWage() {
        return wage;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double setWage(double wage) {
        this.wage = wage;
        return this.wage;
    }


}

package Classes;

import Exceptions.AgeException;
import Exceptions.DriverExperienceException;

public abstract class Person {
    private int age;
    private String name;
    private String surname;

    public Person() {
    }



    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException{
        if (age <0) {
            throw new AgeException("Age can't be less 0");
        }else if(age > 100){
            throw new AgeException("Age can't be more than 100");
        }else{
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}

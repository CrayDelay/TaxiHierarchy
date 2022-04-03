package Classes;

public abstract class Company
{
    private String name;

    public Company(){};

    public Company(String name)
    {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return
               "Company name:" + name +"\n";
    }

}

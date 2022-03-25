package Classes;

public class Company
{
    private String name;

    public Company(String _name)
    {
        this.name=_name;
    }

    public Company(){};

    public void setName(String _name) {
        name = _name;
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

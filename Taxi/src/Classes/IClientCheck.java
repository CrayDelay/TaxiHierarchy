package Classes;

import java.util.ArrayList;

public interface IClientCheck
{
    public abstract void CheckStatus(ArrayList<Client> clients);

    double CheckStatus(ArrayList<Client> clients, int index);
}

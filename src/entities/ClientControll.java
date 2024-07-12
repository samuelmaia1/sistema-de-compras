package entities;

public class ClientControll {
    public static Client newClient(String name, String email){
        return new Client(name, email);
    }
}

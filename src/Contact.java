public class Contact {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public Contact (String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Nome: " + name + " | " + "Telefone: " + phoneNumber + " | " + "Endereço: " + address;
    }
}
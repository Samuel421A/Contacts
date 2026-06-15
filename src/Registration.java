import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    private final Scanner reader = new Scanner(System.in);
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private int counter = 0;

    public void toRegisterAndShow() throws IOException {
        System.out.println("QUANTOS CONTATOS VOCÊ QUER CADASTRAR?");
        int quantity = reader.nextInt();
        reader.nextLine();

        for (int i = 0; i < quantity; i++) {
            counter++;

            System.out.println(counter + "º CONTATO:" + "\n" + "----------------------------------------------");
            System.out.println("Digite o nome:");
            String nome = reader.nextLine();

            System.out.println("Digite o telefone:");
            String telefone = reader.nextLine();

            System.out.println("Digite o endereço:");
            String endereco = reader.nextLine();

            Contact contact = new Contact(nome, telefone, endereco);

            contacts.add(contact);
        }

        counter = 0;
        for (Contact contact : contacts) {
            counter++;
            System.out.println(counter + "º CONTATO: " + contact);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("contacts.json");
        String json = gson.toJson(contacts);
        writer.write(json);
        writer.close();
    }
}
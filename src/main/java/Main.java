import dao.ClientDao;
import models.Client;

import dao.ClientDao;
import models.Client;

    public class Main {
        public static void main(String[] args) {
            ClientDao clientDao = new ClientDao();

            Client newClient = new Client();
            newClient.setFullName("Jose Duran");
            newClient.setEmail("joseduran@gmail.com");
            newClient.setPhone("123456789");
            newClient.setRegisterDate("2024-08-10");

            // Save the new client
            clientDao.save(newClient);
            System.out.println("Client saved successfully!");

            // Retrieve and print the client by ID
            Client retrievedClient = clientDao.getClient(newClient.getId());
            if (retrievedClient != null) {
                System.out.println("Retrieved client: " + retrievedClient.getFullName());
                System.out.println("Email: " + retrievedClient.getEmail());
                System.out.println("Phone: " + retrievedClient.getPhone());
                System.out.println("Register Date: " + retrievedClient.getRegisterDate());
            } else {
                System.out.println("Client not found.");
            }
        }
    }



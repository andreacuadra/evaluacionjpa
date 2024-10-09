package dao;

import interfaces.IClient;
import models.Client;

import java.util.List;

public class ClientDao implements IClient {
    @Override
    public void save(Client client) {
        
    }

    @Override
    public Client getClient(Long id) {
        return null;
    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public List<Client> getAllClients() {
        return List.of();
    }
}

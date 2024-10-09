package interfaces;

import models.Client;

import java.util.List;

public interface IClient {
    public void save(Client client);
    public Client getClient(Long id);
    public void delete(Client client);
    public void update(Client client);
    public List<Client> getAllClients();
}

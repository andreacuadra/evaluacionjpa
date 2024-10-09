package dao;

import interfaces.IClient;
import jakarta.persistence.EntityManager;
import models.Client;

import java.util.List;

public class ClientDao implements IClient {
    @Override
    public void save(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }

    @Override
    public Client getClient(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Client.class, id);
    }

    @Override
    public void delete(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        Client clientToDelete = em.find(Client.class, client.getId());
        if (clientToDelete != null) {
            em.remove(clientToDelete);
        }
    }

    @Override
    public void update(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
    }

    @Override
    public List<Client> getAllClients() {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.createQuery("from Client", Client.class).getResultList();
    }
}

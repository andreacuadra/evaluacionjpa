package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="clients")
@Getter @Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "clients_id_seq", allocationSize = 1)
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String registerDate;

    public Client() {
    }

    public Client(Long id, String fullName, String email, String phone, String registerDate) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.registerDate = registerDate;
    }

}

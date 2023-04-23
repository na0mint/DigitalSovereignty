package ru.Hackaton.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditAgent {
    @Id
    String username;
    String password;
    String name;
    String surname;
    String patronymic;
    boolean isAdmin;
    @Temporal(TemporalType.TIMESTAMP)
    Date createdAt;
    @ManyToMany
    List<SellPoint> points;

    @OneToMany(cascade = CascadeType.ALL)
    List<Order> orders;
}

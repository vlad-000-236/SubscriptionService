package com.VI__236.SubscriptionService.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @OneToMany(mappedBy = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
}

package com.example.bbokstorelast.model.entity;


import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="first_name")

    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="email")
    String email;

    @Column(name = "contact_number")
    String contactNumber;

   @Column(name="registration_date", columnDefinition = "TIMESTAMP default now()")
    LocalDateTime registrationDate=LocalDateTime.now();
    @OneToOne(fetch=FetchType.LAZY)
            @JoinColumn(name="account_id")
   Account account;

    @OneToMany(mappedBy = "user")
    Set<Review> reviews;
}

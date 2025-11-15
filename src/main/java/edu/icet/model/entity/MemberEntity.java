package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MemberEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate dob;
    private double BMI;
    private String phoneNubmer;
    private double registrationFee;
    private double subscription;
}

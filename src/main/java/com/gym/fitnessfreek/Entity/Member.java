package com.gym.fitnessfreek.Entity;

import com.gym.fitnessfreek.Enums.Gender;
import com.gym.fitnessfreek.Enums.Membership;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.StandardException;

import java.util.Date;
@Entity
@Data
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Enumerated(EnumType.STRING)
  private Gender gender;

  private String phone;
  private String email;
  @Enumerated(EnumType.STRING)
  private Membership membership;
  private Date dob;


}

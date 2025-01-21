package com.gym.fitnessfreek.Entity;

import com.gym.fitnessfreek.Enums.Gender;
import com.gym.fitnessfreek.Enums.Membership;
import lombok.Data;
import lombok.experimental.StandardException;

import java.util.Date;
@Data
public class Member {
  private Long id;
  private String name;
  private Gender gender;
  private String phone;
  private String email;
  private Membership membership;
  private Date dob;


}

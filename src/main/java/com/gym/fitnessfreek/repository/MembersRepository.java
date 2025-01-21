package com.gym.fitnessfreek.repository;

import com.gym.fitnessfreek.Entity.Member;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Data
public class MembersRepository {
    public Map<Long, Member> member=new HashMap<>();

    public Long id = 0L;


}

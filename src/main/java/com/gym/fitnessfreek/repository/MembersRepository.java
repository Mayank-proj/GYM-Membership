package com.gym.fitnessfreek.repository;

import com.gym.fitnessfreek.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MembersRepository  extends JpaRepository< Member,Long> {
   /* public Map<Long, Member> member=new HashMap<>();

    public Long id = 0L;
*/

}

package com.gym.fitnessfreek.service;

import com.gym.fitnessfreek.dto.MemberInputDto;
import com.gym.fitnessfreek.dto.MemberOutputDto;

import java.util.List;

public interface MemberService {
    MemberOutputDto getMember(Long id);
    List<MemberOutputDto> getAllMembers();
    MemberOutputDto addMember(MemberInputDto memberInputDto);
    MemberOutputDto updateMember(Long id,MemberInputDto memberInputDto);
    String removedMember(Long id);
}

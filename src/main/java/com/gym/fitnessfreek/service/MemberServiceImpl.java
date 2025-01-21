package com.gym.fitnessfreek.service;

import com.gym.fitnessfreek.Entity.Member;
import com.gym.fitnessfreek.dto.MemberInputDto;
import com.gym.fitnessfreek.dto.MemberOutputDto;
import com.gym.fitnessfreek.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MembersRepository membersRepository;
    @Override

    public MemberOutputDto getMember(Long id) {
     MemberOutputDto memberOutputDto=new MemberOutputDto();

     Member member= membersRepository.member.get(id);

     memberOutputDto.setId(member.getId());
     memberOutputDto.setName(member.getName());
     memberOutputDto.setGender(member.getGender());
     memberOutputDto.setPhone(member.getPhone());
     memberOutputDto.setEmail(member.getEmail());
     memberOutputDto.setMembership(member.getMembership());
     memberOutputDto.setDob(member.getDob());
     return memberOutputDto;

    }

    @Override
    public List<MemberOutputDto> getAllMembers() {
        List<MemberOutputDto> memberOutputDtoList=new ArrayList<>();

        List<Member> memberList=new ArrayList<>(membersRepository.member.values());
        for(Member member:memberList){
            MemberOutputDto memberOutputDto=new MemberOutputDto();

            memberOutputDto.setId(member.getId());
            memberOutputDto.setName(member.getName());
            memberOutputDto.setGender(member.getGender());
            memberOutputDto.setPhone(member.getPhone());
            memberOutputDto.setEmail(member.getEmail());
            memberOutputDto.setMembership(member.getMembership());
            memberOutputDto.setDob(member.getDob());

            memberOutputDtoList.add(memberOutputDto);
        }
        return  memberOutputDtoList;
    }

    @Override
    public MemberOutputDto addMember(MemberInputDto memberInputDto) {
        Member member= new Member();
        Long id= ++membersRepository.id;
        member.setId(id);
        member.setName(memberInputDto.getName());
        member.setGender(memberInputDto.getGender());
        member.setPhone(memberInputDto.getPhone());
        member.setEmail(memberInputDto.getEmail());
        member.setMembership(memberInputDto.getMembership());
        member.setDob(memberInputDto.getDob());

        membersRepository.member.put(id,member);
        member=null;

        member=membersRepository.member.get(id);

        MemberOutputDto memberOutputDto=new MemberOutputDto();
        memberOutputDto.setId(member.getId());
        memberOutputDto.setName(member.getName());
        memberOutputDto.setGender(member.getGender());
        memberOutputDto.setPhone(member.getPhone());
        memberOutputDto.setEmail(member.getEmail());
        memberOutputDto.setMembership(member.getMembership());
        memberOutputDto.setDob(member.getDob());

        return memberOutputDto;
    }

    @Override
    public MemberOutputDto updateMember(Long id, MemberInputDto memberInputDto) {
        Member member= new Member();

        member.setId(id);
        member.setName(memberInputDto.getName());
        member.setGender(memberInputDto.getGender());
        member.setPhone(memberInputDto.getPhone());
        member.setEmail(memberInputDto.getEmail());
        member.setMembership(memberInputDto.getMembership());
        member.setDob(memberInputDto.getDob());

        membersRepository.member.put(id,member);
        member=null;

        member=membersRepository.member.get(id);

        MemberOutputDto memberOutputDto=new MemberOutputDto();
        memberOutputDto.setId(member.getId());
        memberOutputDto.setName(member.getName());
        memberOutputDto.setGender(member.getGender());
        memberOutputDto.setPhone(member.getPhone());
        memberOutputDto.setEmail(member.getEmail());
        memberOutputDto.setMembership(member.getMembership());
        memberOutputDto.setDob(member.getDob());

        return memberOutputDto;
    }

    @Override
    public String removedMember(Long id) {
        String name=membersRepository.member.get(id).getName();
       membersRepository.member.remove(id);
       return "Member name" + name + "and their "+ id + " has been removed successfully";
    }
}

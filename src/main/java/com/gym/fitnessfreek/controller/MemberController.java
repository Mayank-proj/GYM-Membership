package com.gym.fitnessfreek.controller;

import com.gym.fitnessfreek.dto.MemberInputDto;
import com.gym.fitnessfreek.dto.MemberOutputDto;
import com.gym.fitnessfreek.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/{id}")
    public ResponseEntity<MemberOutputDto> getMember(@PathVariable Long id){
        return new ResponseEntity<>(memberService.getMember(id), HttpStatusCode.valueOf(200));
    }
    @GetMapping()
    public ResponseEntity<List<MemberOutputDto>> getAllMember(){
        return new ResponseEntity<>(memberService.getAllMembers(), HttpStatusCode.valueOf(200));
    }
    @PostMapping
    public ResponseEntity<MemberOutputDto> addMember(@RequestBody MemberInputDto memberInputDto){
      return new ResponseEntity<>(memberService.addMember(memberInputDto),HttpStatusCode.valueOf(201));
    }
    @PutMapping("/{id}")
    public ResponseEntity<MemberOutputDto> updateMember(@PathVariable Long id, MemberInputDto memberInputDto){
        return new ResponseEntity<>(memberService.updateMember(id, memberInputDto),HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> removedMember(@PathVariable Long id){
        return new ResponseEntity<>(memberService.removedMember(id),HttpStatusCode.valueOf(200));
    }


}

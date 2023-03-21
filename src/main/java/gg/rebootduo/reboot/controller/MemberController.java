package gg.rebootduo.reboot.controller;

import gg.rebootduo.reboot.domain.dto.MemberRequestDTO;
import gg.rebootduo.reboot.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/api/member/register")
    public String register(@RequestBody MemberRequestDTO memberRequestDTO) {
        return memberService.register(memberRequestDTO);

    }

}

package gg.rebootduo.reboot.service;

import gg.rebootduo.reboot.domain.Member;
import gg.rebootduo.reboot.domain.dto.MemberRequestDTO;
import gg.rebootduo.reboot.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String register(MemberRequestDTO memberRequestDTO) {
        Member user = Member.builder()
                .id(1L)
                .userName(memberRequestDTO.getUserName())
                .password(memberRequestDTO.getPassword())
                .name(memberRequestDTO.getName())
                .age(memberRequestDTO.getAge())
                .build();

        Member save = memberRepository.save(user);

        if(save != null) {
            return "OK";
        }
        return "BAD";
    }
}

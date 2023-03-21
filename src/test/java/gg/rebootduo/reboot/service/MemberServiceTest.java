package gg.rebootduo.reboot.service;

import gg.rebootduo.reboot.domain.dto.MemberRequestDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    void crud() {

        MemberRequestDTO userRequestDTO = new MemberRequestDTO();
        userRequestDTO.setUserName("spammy");
        userRequestDTO.setPassword("123");
        userRequestDTO.setName("붐킨");
        userRequestDTO.setAge(20);

        String result = memberService.register(userRequestDTO);

        Assertions.assertThat(result).isEqualTo("OK");

    }
}
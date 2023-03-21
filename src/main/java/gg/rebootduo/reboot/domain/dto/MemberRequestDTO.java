package gg.rebootduo.reboot.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberRequestDTO {

    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private int age;

}

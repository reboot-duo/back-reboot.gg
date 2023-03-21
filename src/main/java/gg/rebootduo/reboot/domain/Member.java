package gg.rebootduo.reboot.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Member {

    @Id
    private Long id;
    private String userName;
    private String password;
    private String name;
    private int age;

    @Builder
    public Member(Long id, String userName, String password, String name, int age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public Member() {

    }
}

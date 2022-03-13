package com.example.test.bean;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
@Repository
@Table(name = "user_info")
@Data
public class UserInfo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;

}

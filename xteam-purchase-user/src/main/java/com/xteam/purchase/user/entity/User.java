package com.xteam.purchase.user.entity;

import lombok.Data;

@Data
public class User {
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     *
     */
    private Float charge;

    /**
     *
     */
    private Boolean status;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String avatar;

    /**
     *
     */
    private String invitationCode;

    /**
     *
     */
    private Integer inviter;

    /**
     *
     */
    private Integer createTime;

}
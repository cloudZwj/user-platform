package org.geektimes.projects.user.domain;

import lombok.Data;

import java.util.Objects;

/**
 * 用户领域对象
 *
 * @since 1.0
 */
@Data
public class User {

    private Long id;

    private String name;

    private String password;

    private String email;

    private String phoneNumber;
}

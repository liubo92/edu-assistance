package com.edu.eduassistance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lb
 * @create 2021-05-13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

    private String phone;
}

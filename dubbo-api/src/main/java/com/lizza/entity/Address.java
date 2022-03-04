package com.lizza.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户收货地址
 */
@Data
@ToString
@AllArgsConstructor
public class Address implements Serializable {

    private int id;
    private int userId;
    private String address;
}

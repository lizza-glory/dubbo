package com.lizza.api;

import com.lizza.entity.Address;

import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {

    List<Address> getAddressByUserId(int userId);
}

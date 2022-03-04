package com.lizza.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lizza.api.UserService;
import com.lizza.entity.Address;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Service(interfaceClass = UserService.class, timeout = 500)
public class UserServiceImpl implements UserService {

    @Override
    public List<Address> getAddressByUserId(int id) {
        try { Thread.sleep(1000); } catch (Exception e) {}
        return new ArrayList<Address>(){{
            add(new Address(1001, 1001, "北京市海淀区中关村大街 8-909-102"));
            add(new Address(1002, 1001, "江苏省杭州市西湖大道 8-909-102"));
            add(new Address(1003, 1001, "陕西省西安市碑林区金花南路 5 号"));
        }};
    }
}

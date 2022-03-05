package com.lizza.spi.dubbo.service;

import com.lizza.spi.dubbo.api.Protocol;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2022-03-05
 */
public class DubboProtocol implements Protocol {

    @Override
    public void handle(String msg) {
        System.out.println("dubbo handle: " + msg);
    }
}

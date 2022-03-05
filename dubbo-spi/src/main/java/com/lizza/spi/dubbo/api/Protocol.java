package com.lizza.spi.dubbo.api;

import org.apache.dubbo.common.extension.SPI;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2022-03-05
 */
@SPI
public interface Protocol {

    void handle(String msg);
}

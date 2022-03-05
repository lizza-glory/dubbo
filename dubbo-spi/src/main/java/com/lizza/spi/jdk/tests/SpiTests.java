package com.lizza.spi.jdk.tests;

import com.lizza.spi.jdk.api.Protocol;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ServiceLoader 实现 SPI 机制, 需要在 resources 下创建:
 * META-INF/services/接口全限定名 这样的文件, 文件中对实现类进行配置
 *
 * jdk 的 ServiceLoader 可以实现 spi 机制, 但是有两个缺点
 * 1. 不能按需加载
 * 2. 不支持 AOP 功能
 */
public class SpiTests {

    @Test
    public void test1() {
        ServiceLoader<Protocol> protocols = ServiceLoader.load(Protocol.class);
        Iterator<Protocol> iterator = protocols.iterator();
        while (iterator.hasNext()) {
            iterator.next().handle("test spi!");
        }
    }
}

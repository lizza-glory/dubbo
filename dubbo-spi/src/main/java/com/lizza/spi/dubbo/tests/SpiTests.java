package com.lizza.spi.dubbo.tests;

import com.lizza.spi.dubbo.api.Protocol;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.model.ApplicationModel;
import org.junit.Test;

/**
 * Dubbo SPI 实现机制, 首先 dubbo 重新约定了配置文件结构
 *     1. META-INF/services/ 目录：该目录下的 SPI 配置文件是为了用来兼容 Java SPI 。
 *     2. META-INF/dubbo/ 目录：该目录存放用户自定义的 SPI 配置文件。(通常使用这个)
 *     3. META-INF/dubbo/internal/ 目录：该目录存放 Dubbo 内部使用的 SPI 配置文件。
 *
 *
 *
 * 链接：https://juejin.cn/post/6872138926216511501
 */
public class SpiTests {

    @Test
    public void test1() {
        ExtensionLoader<Protocol> loader = ApplicationModel
                .defaultModel()
                .getDefaultModule()
                .getExtensionLoader(Protocol.class);
        Protocol protocol = loader.getExtension("http");
        protocol.handle("http msg!");
    }
}

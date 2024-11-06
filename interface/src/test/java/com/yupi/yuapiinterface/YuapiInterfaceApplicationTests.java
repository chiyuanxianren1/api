package com.xg.interface;

import com.xg.clientsdk.client.YuApiClient;
import com.xg.clientsdk.model.User;
import org.junit.jupiter..Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *

 */
@SpringBootTest
class YuInterfaceApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Test
    void contextLoads() {
        String result = yuApiClient.getNameByGet("yupi");
        User user = new User();
        user.setUsername("作_者 【程序员_鱼皮】 https://space.bilibili.com/12890453/");
        String usernameByPost = yuApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}

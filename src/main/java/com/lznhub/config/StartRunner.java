package com.lznhub.config;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 11:02
 **/
@Component
@RequiredArgsConstructor
public class StartRunner  implements ApplicationRunner{
    private static final Logger log = LoggerFactory.getLogger(StartRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("》》》》》》服务成功已启动》》》》》》开始执行数据加载等操作》》》》");
    }
}

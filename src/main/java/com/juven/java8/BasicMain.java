package com.juven.java8;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * 第一个main，用于测试日志的打印及上传到GitHub
 */
public class BasicMain {

    public static Logger logger = LogManager.getLogger(BasicMain.class);

    public static void main(String[] args) {
        logger.info("打印的日志去哪里了");
    }

}

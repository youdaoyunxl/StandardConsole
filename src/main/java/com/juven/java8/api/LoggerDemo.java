package com.juven.java8.api;

import java.util.logging.*;

public class LoggerDemo {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo.class.getName());
        logger.log(Level.WARNING, "WARNING 信息");
        logger.log(Level.INFO, "INFO 信息");
        logger.log(Level.CONFIG,"CONFIG 信息");
        logger.log(Level.FINE,"FINE 信息");
    }
}

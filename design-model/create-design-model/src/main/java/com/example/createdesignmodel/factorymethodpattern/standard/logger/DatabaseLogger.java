package com.example.createdesignmodel.factorymethodpattern.standard.logger;

/**
 * @author qzh
 * @Description: 数据库日志记录器
 * @date 2024/1/6 19:02
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录器开始记录日志");
    }
}

package com.example.createdesignmodel.factorymethodpattern.logger;

/**
 * @author qzh
 * @Description:文件日志记录器
 * @date 2024/1/6 19:03
 */
public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录器开始记录日志");
    }
}

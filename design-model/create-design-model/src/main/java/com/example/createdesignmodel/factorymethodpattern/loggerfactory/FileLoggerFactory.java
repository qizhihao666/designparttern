package com.example.createdesignmodel.factorymethodpattern.loggerfactory;

import com.example.createdesignmodel.factorymethodpattern.logger.FileLogger;
import com.example.createdesignmodel.factorymethodpattern.logger.Logger;

/**
 * @author qzh
 * @Description: 文件日志记录工厂类
 * @date 2024/1/6 19:08
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger getLogger() {
        return new FileLogger();
    }
}

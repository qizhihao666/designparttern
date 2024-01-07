package com.example.createdesignmodel.factorymethodpattern.standard.loggerfactory;

import com.example.createdesignmodel.factorymethodpattern.standard.logger.DatabaseLogger;
import com.example.createdesignmodel.factorymethodpattern.standard.logger.Logger;

/**
 * @author qzh
 * @Description: 数据库日志记录工厂类
 * @date 2024/1/6 19:06
 */
public class DatabaseLoggerFactory implements LoggerFactory{

    //这里可以做一些初始化配置的复杂操作

    // 获取具体的日志记录器
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }
}

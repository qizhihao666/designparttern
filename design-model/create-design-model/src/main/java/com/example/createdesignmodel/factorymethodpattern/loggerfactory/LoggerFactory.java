package com.example.createdesignmodel.factorymethodpattern.loggerfactory;

import com.example.createdesignmodel.factorymethodpattern.logger.Logger;

/**
 * @author qzh
 * @Description: 抽象工厂类
 * @date 2024/1/6 19:04
 */
public interface LoggerFactory {
    /**
     *  获取日志记录器
     * @return
     */
    public Logger getLogger();

}

package com.example.createdesignmodel.factorymethodpattern.extend.reloadfactorymethod;

import com.example.createdesignmodel.factorymethodpattern.standard.logger.Logger;

/**
 * @author qzh
 * @Description: 抽象工厂类 -- 重载工厂方法
 * @date 2024/1/6 19:04
 */
public interface LoggerFactoryReload {
    /**
     *  获取日志记录器
     * @return
     */
    public Logger getLogger();


    /**
     *  通过字符串-获取日志记录器
     * @return
     */
    public Logger getLogger(String args);

    /**
     *  通过对象-获取日志记录器
     * @return
     */
    public Logger getLogger(Object obj);

}

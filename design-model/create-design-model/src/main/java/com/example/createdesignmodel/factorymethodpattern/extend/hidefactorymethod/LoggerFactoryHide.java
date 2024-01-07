package com.example.createdesignmodel.factorymethodpattern.extend.hidefactorymethod;

import com.example.createdesignmodel.factorymethodpattern.standard.logger.Logger;
import com.example.createdesignmodel.utils.XMLUtil;

/**
 * @author qzh
 * @Description: 抽象工厂类 -- 隐藏工厂方法   即将日志记录器的创建和使用都放到工厂方法中
 * @date 2024/1/6 19:04
 */
public abstract class LoggerFactoryHide {

    public void writeLog(String loggerObjUrl){
        // 创建对象
        Logger beanByXml = (Logger)XMLUtil.getBeanByXml(loggerObjUrl);
        assert beanByXml != null;
        // 使用对象
        beanByXml.writeLog();
    }

    public abstract Logger getLogger();

}

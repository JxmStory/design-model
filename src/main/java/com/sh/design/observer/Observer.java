package com.sh.design.observer;


/**
 *  收到通知处理
 *  @author micomo
 *  @date 2020/1/20 14:17
 */
public interface Observer {

    /**
     * 收到通知处理
     * @param news
     */
    void update(String news);

}

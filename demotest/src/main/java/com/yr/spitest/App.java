package com.yr.spitest;

import com.yr.spitinterface.Connection;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServiceLoader<Connection> load = ServiceLoader.load(Connection.class);

        for (Connection cc:load) {
            System.out.println("成功加载到实现类"+cc);
            System.out.println(cc.connectdb("mysql"));
        }
    }
}

package com.yr.mysqlconn;

import com.yr.spitinterface.Connection;

public class MysqlImpl implements Connection {

    @Override
    public String connectdb(String s) {
        return "this is a mysql conn"+s;
    }
}

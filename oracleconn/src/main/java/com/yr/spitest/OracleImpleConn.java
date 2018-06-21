package com.yr.spitest;

import com.yr.spitinterface.Connection;

public class OracleImpleConn implements Connection{
    @Override
    public String connectdb(String s) {
        return "this is a oracle conn";
    }
}

package com.hamzath.SQLDialect;

import org.hibernate.dialect.MySQLDialect;

public class CustomMySQLDialect extends MySQLDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=MyISAM";
    }
}

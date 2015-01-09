package com.tele2.liquibase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class Reader {
    
    private DataSource dataSource;
    
    public void read() throws SQLException{
        Statement statement = dataSource.getConnection().createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM test");
        System.out.println("Reading");
        while(rs.next()){
            System.out.println("{name="+rs.getString("name")+",email="+rs.getString("email")+"}");
        }
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}

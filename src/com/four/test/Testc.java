package com.four.test;

import com.four.Util.DBUtil;

import java.sql.*;

public class Testc {

    @org.junit.Test
    public void test(){
        Connection connection =null;
        ResultSet resultSet = null;
        Statement statement =null;
        try {
          String sql = "select * from application";
          connection = DBUtil.getConnection();
          statement =  connection.prepareStatement(sql);
          resultSet =((PreparedStatement) statement).executeQuery();
          if(resultSet.next()){
              System.out.println("resultSet");
          }else{
              System.out.println("-------------");
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

package com.example.demo.repository;

import java.sql.*;

public class LoadDriver {
    String JDBC_DRIVER = "org.mariadb.jdbc.Driver"; //드라이버
    String DB_URL = "jdbc:mariadb://localhost:3306/mariadb"; //접속할 DB 서버
    String USER_NAME = "jun"; //DB에 접속할 사용자 이름
    String PASSWORD = "tjgusskavys8*"; //사용자의 비밀번호

    public void loadDriver() {
        Connection conn = null;
        Statement state = null;
        try { //Reflection 방식
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(
                    DB_URL,
                    USER_NAME,
                    PASSWORD); //db 내의 데이터를 저장
            state = conn.createStatement(); //sql 문을 실행하기 위해 conn 연결 정보를 state로 생성

            String sql;
            sql = "select * from salary";
            ResultSet rs = state.executeQuery(sql); // sql 실행결과를 rs에 저장
            // 데이터를 읽어주는 쿼리
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int m_salary = rs.getInt("m_salary"); // select 로 가져온 속성을 int 타입으로 반환
                int a_sales = rs.getInt("a_sales");
                System.out.println("id: "+id);
            }
            rs.close();
            state.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if(state != null)
                    state.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(conn != null)
                    conn.close();
            }catch (SQLException e){

            }
        }
    }
    public static void main(String args[]){
        System.out.println("Test");
        LoadDriver load = new LoadDriver();
        load.loadDriver();
    }
}
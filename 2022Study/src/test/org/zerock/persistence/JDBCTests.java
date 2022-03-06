package org.zerock.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

@Log4j
public class JDBCTests {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testConnection(){
        try {
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                    "book_ex", "book_ex")) {
                log.info("DB연결에 성공 했을까요????:::"+con);
                //성공 했음. 서버 돌리지말고 꼭 run으로 해서 돌리기 ^^~
            }
        } catch (Exception e) {
        }

        ;
    }
    }
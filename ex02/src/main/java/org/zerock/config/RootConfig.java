package org.zerock.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"org.zerock.mapper"})
//매퍼 경로는 리소스의 xml경로랑 똑같이 할것 !!!
public class RootConfig {


    @Bean
    public DataSource dataSource(){
        System.out.println("빈설정이 되었을까요??");
        HikariConfig hikariConfig = new HikariConfig();
        //hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        //오라클 드라이버
      //  hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
        hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        //log4J드라이버 등록(???)
        hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521:XE");

        //jdbc Url
        hikariConfig.setUsername("book_ex");
        //jdbc연결할 계정 ID
        hikariConfig.setPassword("book_ex");
        //jdbc 연결할 계정 pwd

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        //DB에 연결할 BEAN을 등록하였습니다!!!!



        return dataSource;
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());

        return (SqlSessionFactory)sqlSessionFactory.getObject();

    }

}



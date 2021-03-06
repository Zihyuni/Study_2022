package org.zerock.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//root-context.xml을 대신하는 것임.
@ComponentScan(basePackages = {"org.zerock.sample"})
//basePackages에서 오타내지말것!!!!!
@MapperScan(basePackages = {"org.zerock.mapper"})
public class RootConfig {

    @Bean
    //bean등록을 해줘야한다.. 안하면 test클래스에서 rootconfig클래스에 datasource메소드를 못읽음.
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
      //  hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        //오라클 드라이버
       // hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
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
        return (SqlSessionFactory) sqlSessionFactory.getObject();

    }

}

package com.company.project.support.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.company.project.dao")
public class MyBatisCfg {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisCfg.class);

//    @Value("${spring.datasource.druid.url}")
//    private String url;
//    @Value("${spring.datasource.druid.username}")
//    private String username;
//    @Value("${spring.datasource.druid.password}")
//    private String password;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        DataSource dataSource = DataSourceBuilder.create()
                .type(DruidDataSource.class)
                .build();
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
        return dataSource;
    }

    //    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(resolver.getResources("com/company/project/dao/**/*Mapper.xml"));
//        bean.setTypeAliasesPackage("study.springboot.dao");
//        return bean.getObject();
//    }
}

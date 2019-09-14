/**
 * Author:   Tang
 * Date:     2019/9/14 16:29
 * Description:
 */
package com.zzgs.springboot_demp01.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author:   Tang
 * Date:     2019/9/14 16:29
 * Description:
 */
@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
}

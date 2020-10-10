package com.kiboan.configurer;

import com.kiboan.oss.OSSTools;
import com.kiboan.properties.OSSProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenhao.ye
 * @date 2020-10-09
 */
@Configuration
@EnableConfigurationProperties({OSSProperties.class})
public class OSSConfigurer {

    @Bean
    @ConditionalOnMissingBean({OSSTools.class})
    public OSSTools ossTools(OSSProperties ossProperties) {
        return new OSSTools(ossProperties);
    }

}

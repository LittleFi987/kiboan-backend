package com.kiboan.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chenhao.ye
 * @date 2020-10-09
 */
@ConfigurationProperties(prefix = "oss")
@Data
public class OSSProperties {

    private String bucketName;

    private String endpoint;

    private String accessKey;

    private String accessSecret;

    private String prefix;

}

package com.kiboan.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.kiboan.properties.OSSProperties;
import com.kiboan.util.UUIDUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;

/**
 * @author chenhao.ye
 * @date 2020-10-09
 */
public class OSSTools {

    private OSSProperties ossProperties;


    public OSSTools(OSSProperties ossProperties) {
        this.ossProperties = ossProperties;
    }


    public String upload(ByteArrayInputStream inputStream, String fileName) {
        OSS ossClient = new OSSClientBuilder().build(ossProperties.getEndpoint(),
                ossProperties.getAccessKey(), ossProperties.getAccessSecret());
        try {
            if (StringUtils.isEmpty(fileName)) {
                throw new IllegalArgumentException("fileName.is.null");
            }
            String[] split = fileName.split(".");
            String suffix = split[split.length - 1];
            String newFileName = UUIDUtils.get() + "." + suffix;
            PutObjectRequest putRequest = new PutObjectRequest(ossProperties.getBucketName(),
                    newFileName, inputStream);

            ossClient.putObject(putRequest);
            return newFileName;
        } finally {
            ossClient.shutdown();
        }
    }
}

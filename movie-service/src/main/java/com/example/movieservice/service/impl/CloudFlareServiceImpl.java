package com.example.movieservice.service.impl;

import com.example.movieservice.service.CloudFlareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.file.Path;
import java.util.Map;

@Service
public class CloudFlareServiceImpl implements CloudFlareService {

    @Autowired
    private S3Client s3Client;

    @Value("${cloudflare.r2.bucket-name}")
    private String bucketName;

    public void uploadFile(String key, Path filePath) {
        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();
        s3Client.putObject(putObjectRequest, RequestBody.fromFile(filePath));
    }

}

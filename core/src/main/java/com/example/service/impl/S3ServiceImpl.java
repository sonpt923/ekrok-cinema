package com.example.service.impl;

import com.example.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

import java.io.File;

@Service
public class S3ServiceImpl implements S3Service {

    @Value("${cloudflare.r2.bucket-name}")
    private String bucketName;

    @Autowired
    private S3Client s3Client;

    public String uploadImage(String imageName, File image) {
        return "";
    }

}

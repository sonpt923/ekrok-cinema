package com.example.service;

import java.io.File;

public interface S3Service {

    String uploadImage(String imageName, File image);

}

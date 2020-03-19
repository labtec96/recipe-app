package com.example.recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ch on 2020-03-18
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}

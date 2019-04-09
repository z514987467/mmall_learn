package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhangmingzheng
 * @description
 * @date 2019/4/8
 **/
public interface IFileService {
    String upload(MultipartFile file, String path);
}

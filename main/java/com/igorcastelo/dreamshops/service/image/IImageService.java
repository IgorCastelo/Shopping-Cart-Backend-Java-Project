package com.igorcastelo.dreamshops.service.image;

import com.igorcastelo.dreamshops.dto.ImageDto;
import com.igorcastelo.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long roductId);
    void updateImage(MultipartFile file, Long ImageId);


}

package com.igorcastelo.dreamshops.cotroller;

import com.igorcastelo.dreamshops.dto.ImageDto;
import com.igorcastelo.dreamshops.model.Image;
import com.igorcastelo.dreamshops.model.Product;
import com.igorcastelo.dreamshops.response.ApiResponse;
import com.igorcastelo.dreamshops.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;
import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/images")
public class ImageController {

        private final IImageService imageService;
        @PostMapping("/upload")
        public ResponseEntity<ApiResponse> saveImages(@RequestParam List<MultipartFile> files,@RequestParam Long productId){
        try{
            List<ImageDto> imageDtos = imageService.saveImages(files, productId);
            return ResponseEntity.ok(new ApiResponse("Upload success!", imageDtos));
        }catch (Exception e){
            return  ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Upload Filed",e.getMessage()));
        }
        }
        @GetMapping("/image/download/{imageIdgit submodule update --init --recursive\n}")
        public ResponseEntity<Resource> downloadImage(@PathVariable Long imageId) throws SQLException {
            Image image = imageService.getImageById(imageId);
            ByteArrayResource resource = new ByteArrayResource(image.getImage().getBytes(1, (int)image.getImage().length()));
            return ResponseEntity.ok().contentType(MediaType.parseMediaType(image.getFileType()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attchment; file name=\""+image.getFileName()+"\"")
                    .body(resource);
        }
}

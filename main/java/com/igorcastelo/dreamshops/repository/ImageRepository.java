package com.igorcastelo.dreamshops.repository;

import com.igorcastelo.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

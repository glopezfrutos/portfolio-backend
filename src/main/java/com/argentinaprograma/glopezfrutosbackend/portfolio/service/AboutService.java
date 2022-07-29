package com.argentinaprograma.glopezfrutosbackend.portfolio.service;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.AboutDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.mapper.AboutMapper;
import com.argentinaprograma.glopezfrutosbackend.portfolio.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AboutService {
    private final AboutRepository repository;
    private final AboutMapper mapper;

    public AboutDto createAbout(@Validated AboutDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public List<AboutDto> readAbout() {
        List<AboutDto> list = new ArrayList<>();
        repository.findAll().forEach(element -> list.add(mapper.convertEntityToDto().apply(element)));
        return list;
    }

    public AboutDto updateAbout(@Validated AboutDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public ResponseEntity<Void> deleteAbout(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

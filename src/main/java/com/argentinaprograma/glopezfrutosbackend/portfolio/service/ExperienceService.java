package com.argentinaprograma.glopezfrutosbackend.portfolio.service;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ExperienceDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.mapper.ExperienceMapper;
import com.argentinaprograma.glopezfrutosbackend.portfolio.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository repository;
    private final ExperienceMapper mapper;

    public ExperienceDto createExperience(@Validated ExperienceDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public List<ExperienceDto> readExperience() {
        List<ExperienceDto> list = new ArrayList<>();
        repository.findAll().forEach(element -> list.add(mapper.convertEntityToDto().apply(element)));
        return list;
    }

    public ExperienceDto updateExperience(@Validated ExperienceDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public ResponseEntity<Void> deleteExperience(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

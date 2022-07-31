package com.argentinaprograma.glopezfrutosbackend.portfolio.service;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.EducationDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.mapper.EducationMapper;
import com.argentinaprograma.glopezfrutosbackend.portfolio.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository repository;
    private final EducationMapper mapper;

    public EducationDto createEducation(@Validated EducationDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public List<EducationDto> readEducation() {
        List<EducationDto> list = new ArrayList<>();
        repository.findAll().forEach(element -> list.add(mapper.convertEntityToDto().apply(element)));
        return list;
    }

    public EducationDto updateEducation(@Validated EducationDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public ResponseEntity<Void> deleteEducation(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

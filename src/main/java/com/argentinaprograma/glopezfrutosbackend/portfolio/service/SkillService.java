package com.argentinaprograma.glopezfrutosbackend.portfolio.service;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.SkillDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.mapper.SkillMapper;
import com.argentinaprograma.glopezfrutosbackend.portfolio.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository repository;
    private final SkillMapper mapper;

    public SkillDto createSkill(@Validated SkillDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public List<SkillDto> readSkill() {
        List<SkillDto> list = new ArrayList<>();
        repository.findAll().forEach(element -> list.add(mapper.convertEntityToDto().apply(element)));
        return list;
    }

    public SkillDto updateSkill(@Validated SkillDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public ResponseEntity<Void> deleteSkill(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

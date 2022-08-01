package com.argentinaprograma.glopezfrutosbackend.portfolio.service;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ProjectDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.mapper.ProjectMapper;
import com.argentinaprograma.glopezfrutosbackend.portfolio.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository repository;
    private final ProjectMapper mapper;

    public ProjectDto createProject(@Validated ProjectDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public List<ProjectDto> readProject() {
        List<ProjectDto> list = new ArrayList<>();
        repository.findAll().forEach(element -> list.add(mapper.convertEntityToDto().apply(element)));
        return list;
    }

    public ProjectDto updateProject(@Validated ProjectDto dto) {
        return mapper.convertEntityToDto().apply(repository.save(mapper.convertDtoToEntity().apply(dto)));
    }

    public ResponseEntity<Void> deleteProject(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

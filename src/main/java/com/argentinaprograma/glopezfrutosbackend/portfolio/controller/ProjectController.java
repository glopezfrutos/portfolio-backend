package com.argentinaprograma.glopezfrutosbackend.portfolio.controller;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ProjectDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.service.ProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@RequiredArgsConstructor
@Slf4j
public class ProjectController {
    private final ProjectService service;

    @PostMapping("/project")
    public ProjectDto postProject(@RequestBody ProjectDto dto) {
        log.info("\n***** Creating project record *****");
        return service.createProject(dto);
    }

    @GetMapping("/project")
    public List<ProjectDto> getProject() {
        log.info("\n***** Reading project records *****");
        return service.readProject();
    }

    @PutMapping("/project")
    public ProjectDto putProject(@RequestBody ProjectDto dto) {
        log.info("\n***** Updating project record *****");
        return service.updateProject(dto);
    }

    @DeleteMapping("/project/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable int id) {
        log.info("\n***** Deleting project record *****");
        return service.deleteProject(id);
    }
}

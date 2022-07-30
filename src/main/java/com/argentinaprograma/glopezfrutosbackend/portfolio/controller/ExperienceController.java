package com.argentinaprograma.glopezfrutosbackend.portfolio.controller;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ExperienceDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@RequiredArgsConstructor
@Slf4j
public class ExperienceController {
    private final ExperienceService service;

    @PostMapping("/experience")
    public ExperienceDto postExperience(@RequestBody ExperienceDto dto) {
        log.info("\n***** Creating experience record *****");
        return service.createExperience(dto);
    }

    @GetMapping("/experience")
    public List<ExperienceDto> getExperience() {
        log.info("\n***** Reading experience records *****");
        return service.readExperience();
    }

    @PutMapping("/experience")
    public ExperienceDto putExperience(@RequestBody ExperienceDto dto) {
        log.info("\n***** Updating experience record *****");
        return service.updateExperience(dto);
    }

    @DeleteMapping("/experience/{id}")
    public ResponseEntity<Void> deleteExperience(@PathVariable int id) {
        log.info("\n***** Deleting experience record *****");
        return service.deleteExperience(id);
    }
}

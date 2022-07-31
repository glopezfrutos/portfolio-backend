package com.argentinaprograma.glopezfrutosbackend.portfolio.controller;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.EducationDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.service.EducationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@RequiredArgsConstructor
@Slf4j
public class EducationController {
    private final EducationService service;

    @PostMapping("/education")
    public EducationDto postEducation(@RequestBody EducationDto dto) {
        log.info("\n***** Creating education record *****");
        return service.createEducation(dto);
    }

    @GetMapping("/education")
    public List<EducationDto> getEducation() {
        log.info("\n***** Reading education records *****");
        return service.readEducation();
    }

    @PutMapping("/education")
    public EducationDto putEducation(@RequestBody EducationDto dto) {
        log.info("\n***** Updating education record *****");
        return service.updateEducation(dto);
    }

    @DeleteMapping("/education/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable int id) {
        log.info("\n***** Deleting education record *****");
        return service.deleteEducation(id);
    }
}

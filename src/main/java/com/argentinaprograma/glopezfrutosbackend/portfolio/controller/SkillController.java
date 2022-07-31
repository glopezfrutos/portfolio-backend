package com.argentinaprograma.glopezfrutosbackend.portfolio.controller;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.SkillDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.service.SkillService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@RequiredArgsConstructor
@Slf4j
public class SkillController {
    private final SkillService service;

    @PostMapping("/skill")
    public SkillDto postSkill(@RequestBody SkillDto dto) {
        log.info("\n***** Creating skill record *****");
        return service.createSkill(dto);
    }

    @GetMapping("/skill")
    public List<SkillDto> getSkill() {
        log.info("\n***** Reading skill records *****");
        return service.readSkill();
    }

    @PutMapping("/skill")
    public SkillDto putSkill(@RequestBody SkillDto dto) {
        log.info("\n***** Updating skill record *****");
        return service.updateSkill(dto);
    }

    @DeleteMapping("/skill/{id}")
    public ResponseEntity<Void> deleteSkill(@PathVariable int id) {
        log.info("\n***** Deleting skill record *****");
        return service.deleteSkill(id);
    }
}

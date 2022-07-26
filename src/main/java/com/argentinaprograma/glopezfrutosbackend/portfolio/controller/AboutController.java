package com.argentinaprograma.glopezfrutosbackend.portfolio.controller;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.AboutDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.service.AboutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@RequiredArgsConstructor
@Slf4j
public class AboutController {
    private final AboutService service;

    @PostMapping("/about")
    public AboutDto postAbout(@RequestBody AboutDto dto) {
        log.info("\n***** Creating about section *****");
        return service.createAbout(dto);
    }

    @GetMapping("/about")
    public List<AboutDto> getAbout() {
        log.info("\n***** Reading about section *****");
        return service.readAbout();
    }

    @PutMapping("/about")
    public AboutDto putAbout(@RequestBody AboutDto dto) {
        log.info("\n***** Updating about section *****");
        return service.updateAbout(dto);
    }

    @DeleteMapping("/about/{id}")
    public ResponseEntity<Void> deleteAbout(@PathVariable int id) {
        log.info("\n***** Deleting about section *****");
        return service.deleteAbout(id);
    }
}

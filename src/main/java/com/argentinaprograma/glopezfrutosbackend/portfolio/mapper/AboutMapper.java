package com.argentinaprograma.glopezfrutosbackend.portfolio.mapper;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.AboutDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.About;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class AboutMapper {
    private final ModelMapper mapper;

    public Function<About, AboutDto> convertEntityToDto() {
        return entity -> mapper.map(entity, AboutDto.class);
    }

    public Function<AboutDto, About> convertDtoToEntity() {
        return dto -> mapper.map(dto, About.class);
    }
}

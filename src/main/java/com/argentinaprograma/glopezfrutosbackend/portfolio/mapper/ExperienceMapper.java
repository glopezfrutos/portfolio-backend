package com.argentinaprograma.glopezfrutosbackend.portfolio.mapper;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ExperienceDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.Experience;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class ExperienceMapper {
    private final ModelMapper mapper;

    public Function<Experience, ExperienceDto> convertEntityToDto() {
        return entity -> mapper.map(entity, ExperienceDto.class);
    }

    public Function<ExperienceDto, Experience> convertDtoToEntity() {
        return dto -> mapper.map(dto, Experience.class);
    }
}

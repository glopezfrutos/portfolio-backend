package com.argentinaprograma.glopezfrutosbackend.portfolio.mapper;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.EducationDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.Education;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class EducationMapper {
    private final ModelMapper mapper;

    public Function<Education, EducationDto> convertEntityToDto() {
        return entity -> mapper.map(entity, EducationDto.class);
    }

    public Function<EducationDto, Education> convertDtoToEntity() {
        return dto -> mapper.map(dto, Education.class);
    }
}

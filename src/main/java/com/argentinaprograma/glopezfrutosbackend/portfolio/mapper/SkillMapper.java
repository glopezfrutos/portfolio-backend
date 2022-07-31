package com.argentinaprograma.glopezfrutosbackend.portfolio.mapper;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.SkillDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.Skill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class SkillMapper {
    private final ModelMapper mapper;

    public Function<Skill, SkillDto> convertEntityToDto() {
        return entity -> mapper.map(entity, SkillDto.class);
    }

    public Function<SkillDto, Skill> convertDtoToEntity() {
        return dto -> mapper.map(dto, Skill.class);
    }
}

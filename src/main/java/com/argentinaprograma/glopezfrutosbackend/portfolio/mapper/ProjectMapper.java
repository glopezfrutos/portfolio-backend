package com.argentinaprograma.glopezfrutosbackend.portfolio.mapper;

import com.argentinaprograma.glopezfrutosbackend.portfolio.dto.ProjectDto;
import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.Project;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class ProjectMapper {
    private final ModelMapper mapper;

    public Function<Project, ProjectDto> convertEntityToDto() {
        return entity -> mapper.map(entity, ProjectDto.class);
    }

    public Function<ProjectDto, Project> convertDtoToEntity() {
        return dto -> mapper.map(dto, Project.class);
    }
}

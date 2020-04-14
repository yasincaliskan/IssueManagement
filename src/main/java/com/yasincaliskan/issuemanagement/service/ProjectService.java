package com.yasincaliskan.issuemanagement.service;

import com.yasincaliskan.issuemanagement.dto.ProjectDto;
import com.yasincaliskan.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    List<ProjectDto> getProjectCodeContains(String projectCode);

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto projectDto);
}

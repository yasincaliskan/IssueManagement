package com.yasincaliskan.issuemanagement.repository;

import com.yasincaliskan.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    List<Project> findAll(Sort sort);

    Page<Project> findAll(Pageable pageable);

    Project getByProjectCodeAndIdNot(String projectCode, Long id);
}

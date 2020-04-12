package com.yasincaliskan.issuemanagement.repository;

import com.yasincaliskan.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}

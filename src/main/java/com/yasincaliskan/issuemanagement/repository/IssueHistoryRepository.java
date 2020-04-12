package com.yasincaliskan.issuemanagement.repository;

import com.yasincaliskan.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}

package com.yasincaliskan.issuemanagement.service;

import com.yasincaliskan.issuemanagement.dto.IssueDto;
import com.yasincaliskan.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long id);

    IssueDto update(Long id, IssueDto project);
}

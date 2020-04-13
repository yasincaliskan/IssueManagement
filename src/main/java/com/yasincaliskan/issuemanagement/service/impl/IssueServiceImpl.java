package com.yasincaliskan.issuemanagement.service.impl;

import com.yasincaliskan.issuemanagement.dto.IssueDto;
import com.yasincaliskan.issuemanagement.entity.Issue;
import com.yasincaliskan.issuemanagement.repository.IssueRepository;
import com.yasincaliskan.issuemanagement.service.IssueService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper){
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if(issue.getDate() == null){
            throw new IllegalArgumentException("Issue date cannot be null!");
        }

        Issue issueDb = modelMapper.map(issue, Issue.class);
        issueDb = issueRepository.save(issueDb);

        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public Page<IssueDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}

package com.yasincaliskan.issuemanagement.api;

import com.yasincaliskan.issuemanagement.dto.IssueDto;
import com.yasincaliskan.issuemanagement.service.impl.IssueServiceImpl;
import com.yasincaliskan.issuemanagement.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl) {
        this.issueServiceImpl = issueServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id) {
        IssueDto IssueDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(IssueDto);
    }

    @PostMapping
    public ResponseEntity<IssueDto> createProject(@Valid @RequestBody IssueDto projectDto) {
        return ResponseEntity.ok(issueServiceImpl.save(projectDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id,
                                                    @Valid @RequestBody IssueDto projectDto) {
        return ResponseEntity.ok(issueServiceImpl.update(id, projectDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }
}

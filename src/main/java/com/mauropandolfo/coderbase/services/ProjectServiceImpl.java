package com.mauropandolfo.coderbase.services;

import com.mauropandolfo.coderbase.entites.Project;
import com.mauropandolfo.coderbase.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, Long> implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
}

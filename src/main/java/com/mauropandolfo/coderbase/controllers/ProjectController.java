package com.mauropandolfo.coderbase.controllers;

import com.mauropandolfo.coderbase.entites.Project;
import com.mauropandolfo.coderbase.services.ProjectServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/project")
public class ProjectController extends BaseControllerImpl<Project, ProjectServiceImpl>{

}

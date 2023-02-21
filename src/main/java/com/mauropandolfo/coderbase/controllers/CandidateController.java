package com.mauropandolfo.coderbase.controllers;

import com.mauropandolfo.coderbase.entites.Candidate;
import com.mauropandolfo.coderbase.services.CandidateServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/candidate")
public class CandidateController extends BaseControllerImpl<Candidate, CandidateServiceImpl> {

}

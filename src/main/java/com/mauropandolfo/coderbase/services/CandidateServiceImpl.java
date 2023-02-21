package com.mauropandolfo.coderbase.services;

import com.mauropandolfo.coderbase.entites.Candidate;
import com.mauropandolfo.coderbase.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl extends BaseServiceImpl<Candidate, Long> implements CandidateService{

    @Autowired
    public CandidateRepository candidateRepository;

}

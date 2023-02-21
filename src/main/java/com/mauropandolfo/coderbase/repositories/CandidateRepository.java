package com.mauropandolfo.coderbase.repositories;

import com.mauropandolfo.coderbase.entites.Candidate;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends BaseRepository<Candidate, Long> {

}

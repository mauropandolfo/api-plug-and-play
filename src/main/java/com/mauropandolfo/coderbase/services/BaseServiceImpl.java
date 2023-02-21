package com.mauropandolfo.coderbase.services;

import com.mauropandolfo.coderbase.entites.Base;
import com.mauropandolfo.coderbase.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID>{

    @Autowired
    protected BaseRepository<E, ID> baseRepository;

    @Transactional
    public List<E> findAll() throws Exception {
        try{
            return baseRepository.findAll();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> object = baseRepository.findById(id);
            return object.orElseThrow();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> objectToUpdate = baseRepository.findById(id);
            E object = objectToUpdate.orElseThrow();
            object = baseRepository.save(entity);
            return object;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

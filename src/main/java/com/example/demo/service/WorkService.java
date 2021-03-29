package com.example.demo.service;

import com.example.demo.entity.Work;
import com.example.demo.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {
    @Autowired
    private WorkRepository workRepository;

    public void create(Work work){
        workRepository.save(work);
    }

    public List<Work> findAll(){
        return workRepository.findAll();
    }

    public Work find(Long id){
        return workRepository.findById(id).get();
    }
}

package com.squach.Copypasta.Haven.service;

import com.squach.Copypasta.Haven.model.Copypasta;
import com.squach.Copypasta.Haven.repository.CopypastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopypastaService {
    private CopypastaRepository copypastaRepository;

    @Autowired
    public CopypastaService(CopypastaRepository copypastaRepository) {
        this.copypastaRepository = copypastaRepository;
    }

    public List<Copypasta> getAllCopypasta() {
        List<Copypasta> copypastas = copypastaRepository.findAll();
        return copypastas;
    }
}

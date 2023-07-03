package com.juansenen.emilibase.service;

import com.juansenen.emilibase.domain.Lorry;
import com.juansenen.emilibase.exception.LorryNoFoundException;
import com.juansenen.emilibase.repository.LorryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LorryServiceImpl implements LorryService{

    @Autowired
    LorryRepository lorryRepository;
    @Override
    public List<Lorry> findAll() {
        List<Lorry> lorries = lorryRepository.findAll();
        return lorries;
    }

    @Override
    public Lorry add(Lorry lorry) {
        Lorry newLorry = lorryRepository.save(lorry);
        return newLorry;
    }

    @Override
    public void deleteLorry(long id) throws LorryNoFoundException {
        Lorry deleteLorry = lorryRepository.findById(id)
                        .orElseThrow(()->new LorryNoFoundException("Lorry no found"));
        lorryRepository.delete(deleteLorry);
    }
}

package com.juansenen.emilibase.service;

import com.juansenen.emilibase.domain.Lorry;
import com.juansenen.emilibase.exception.LorryNoFoundException;

import java.util.List;

public interface LorryService {

    List<Lorry> findAll();
    Lorry add(Lorry lorry);

    void deleteLorry(long id) throws LorryNoFoundException;

    Lorry updateLorry(long id, Lorry lorry) throws LorryNoFoundException;
}

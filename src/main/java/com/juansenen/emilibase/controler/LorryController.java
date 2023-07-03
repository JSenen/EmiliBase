package com.juansenen.emilibase.controler;

import com.juansenen.emilibase.domain.Lorry;
import com.juansenen.emilibase.service.LorryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class LorryController {

    @Autowired
    private LorryService lorryService;

    private final Logger logger = LoggerFactory.getLogger(LorryController.class);

    @GetMapping("/lorries")
    public ResponseEntity<List<Lorry>> getAll(){
        return ResponseEntity.ok(lorryService.findAll());
    }


}

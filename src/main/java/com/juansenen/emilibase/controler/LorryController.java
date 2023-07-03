package com.juansenen.emilibase.controler;

import com.juansenen.emilibase.domain.Lorry;
import com.juansenen.emilibase.service.LorryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class LorryController {

    @Autowired
    private LorryService lorryService;

    private final Logger logger = LoggerFactory.getLogger(LorryController.class);

    @GetMapping("/lorries")
    public ResponseEntity<List<Lorry>> getAll(){
        logger.info("Get All lorries");
        return ResponseEntity.ok(lorryService.findAll());

    }

    @PostMapping("/lorry")
    public ResponseEntity<Lorry> addLorry(@RequestBody Lorry lorry){
        Lorry newLorry = lorryService.add(lorry);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(lorry);
    }

}

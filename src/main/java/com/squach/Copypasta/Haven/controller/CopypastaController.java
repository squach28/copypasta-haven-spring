package com.squach.Copypasta.Haven.controller;

import com.squach.Copypasta.Haven.model.Copypasta;
import com.squach.Copypasta.Haven.service.CopypastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/copypasta/")
public class CopypastaController {

    private CopypastaService copypastaService;

    @Autowired
    public CopypastaController(CopypastaService copypastaService) {
        this.copypastaService = copypastaService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Copypasta>> getAllCopypasta() {
        return ResponseEntity.ok(copypastaService.getAllCopypasta());
    }
}

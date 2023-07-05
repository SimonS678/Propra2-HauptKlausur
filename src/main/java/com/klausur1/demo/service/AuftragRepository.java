package com.klausur1.demo.service;

import com.klausur1.demo.domain.auftrag.Auftrag;
import com.klausur1.demo.domain.auftrag.AuftragNr;
import org.springframework.stereotype.Repository;

@Repository
public class AuftragRepository {
    public Auftrag findByAuftragNr(AuftragNr nr) {
        return new Auftrag();
    }
}

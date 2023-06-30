package com.klausur1.demo.service;

import com.klausur1.demo.domain.auftrag.AuftragNr;
import com.klausur1.demo.domain.tisch.Aenderung;
import com.klausur1.demo.domain.tisch.TischRef;

public class TischbauService {
    public TischRef neuerTisch(String basisplanName) {
        return new TischRef();
    }

    public void tischAendern(TischRef ref, Aenderung a) {}

    public AuftragNr auftragErteilen(int kundenNr, TischRef ref) {
        return new AuftragNr();
    }
}

package com.klausur1.demo.service;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.domain.partner.PartnerRef;

import java.util.List;
import java.util.Optional;

public class PartnerRepository {
    public Optional<Partner> findPartnerByPartnerRef(PartnerRef ref) {
        return Optional.empty(); // leeres Optional
    }

    public List<Partner> findPartnerByPlz(int plz) {
        return List.of(); // leere Liste
    }
}

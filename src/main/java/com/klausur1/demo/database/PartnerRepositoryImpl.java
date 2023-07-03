package com.klausur1.demo.database;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.service.PartnerRepository;

import java.util.List;
import java.util.Optional;

public class PartnerRepositoryImpl implements PartnerRepository {
    private final PartnerSpringRepository repository;

    public PartnerRepositoryImpl(PartnerSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Partner> findPartnerByPartnerRef(PartnerRef ref) {
        // Hier eigentlich noch ein mapping von PartnerRef auf Partner
        Optional<Partner> partner = repository.findPartnerByPartnerRef(ref);
        return partner;
    }

    @Override
    public List<Partner> findPartnerByPlz(int plz) {
        return null;
    }
}

package com.klausur1.demo.database;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.domain.partner.PartnerRef;
import com.klausur1.demo.service.PartnerRepository;

import java.util.List;
import java.util.Optional;

public class PartnerRepositoryImpl implements PartnerRepository {
    @Override
    public Optional<Partner> findPartnerByPartnerRef(PartnerRef ref) {
        return Optional.empty();
    }

    @Override
    public List<Partner> findPartnerByPlz(int plz) {
        return null;
    }
}

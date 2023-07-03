package com.klausur1.demo.service;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.database.PartnerRef;

import java.util.List;
import java.util.Optional;

public interface PartnerRepository {
    Optional<Partner> findPartnerByPartnerRef(PartnerRef ref);

    List<Partner> findPartnerByPlz(int plz);
}

package com.klausur1.demo.service;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.domain.partner.PartnerRef;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PartnerRepository extends Repository<Partner, Long> {
    Optional<Partner> findPartnerByPartnerRef(PartnerRef ref);

    List<Partner> findPartnerByPlz(int plz);
}

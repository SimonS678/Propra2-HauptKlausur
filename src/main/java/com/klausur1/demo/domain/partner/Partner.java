package com.klausur1.demo.domain.partner;

import org.springframework.data.annotation.Id;

public class Partner {
    @Id Long partnernr;
    int plz;

    public PartnerRef partnerRef() {
        return new PartnerRef();
    }
}

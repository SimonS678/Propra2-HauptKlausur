package com.klausur1.demo.domain.partner;

import com.klausur1.demo.database.PartnerRef;
import com.klausur1.demo.domain.auftrag.Auftrag;
import org.springframework.data.annotation.Id;

public class Partner {
    Long partnernr;
    int plz;

    public PartnerRef partnerRef() {
        return new PartnerRef();
    }

    public void neuerAuftrag(Auftrag auftrag) {

    }
}

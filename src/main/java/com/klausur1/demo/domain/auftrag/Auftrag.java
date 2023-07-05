package com.klausur1.demo.domain.auftrag;

import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.database.PartnerRef;
import com.klausur1.demo.domain.tisch.TischRef;

public class Auftrag {
    AuftragNr nr;
    PartnerRef partner;
    TischRef tisch;

    public int getPostleitzahl() {
        return 50677;
    }
    public void vermitteltAn(Partner partner) {}
    public Kunde getKunde() {
        return new Kunde();
    }
    public AuftragNr getAufttagNr() {
        return new AuftragNr();
    }
}

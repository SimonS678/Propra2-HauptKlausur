package com.klausur1.demo.service;

import com.klausur1.demo.domain.auftrag.Auftrag;
import com.klausur1.demo.domain.auftrag.AuftragNr;
import com.klausur1.demo.domain.partner.Partner;
import com.klausur1.demo.domain.service.PartnerAuftragService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VermittlungService {

    private final PartnerAuftragService service;
    private final AuftragRepository auftragRepository;

    private final PartnerRepository partnerRepository;

    public VermittlungService(PartnerAuftragService service, AuftragRepository auftragRepository, PartnerRepository partnerRepository) {
        this.service = service;
        this.auftragRepository = auftragRepository;
        this.partnerRepository = partnerRepository;
    }
    public void auftragVermitteln(AuftragNr nr) {

        Auftrag auftrag = auftragRepository.findByAuftragNr(nr);
        List<Partner> partnerList = partnerRepository.findPartnerByPlz(auftrag.getPostleitzahl());

        Partner optimalerPartner = service.optimalerPartner(auftrag, partnerList);
        auftrag.vermitteltAn(optimalerPartner);
        optimalerPartner.neuerAuftrag(auftrag);

        auftragRepository.save(auftrag);
        partnerRepository.save(partnerList);
    }
}

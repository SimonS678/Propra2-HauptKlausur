package com.klausur1.demo.domain.service;

import com.klausur1.demo.domain.auftrag.Auftrag;
import com.klausur1.demo.domain.partner.Partner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerAuftragService {

  public Partner optimalerPartner(Auftrag auftr, List<Partner> partner) {
    return new Partner();
  }
}

package com.klausur1.demo.database;

import org.springframework.data.annotation.Id;

public record PartnerRef(@Id Long partnernr, int plz) {
}

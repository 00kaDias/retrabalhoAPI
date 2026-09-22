package com.lumiere.retrabalhoapi.rework;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RepairDetails {

    private String repairEmployeeId;
    private LocalDate repairDate;
    private Integer reworkedQuantity;
    private Integer scrapQuantity;
}
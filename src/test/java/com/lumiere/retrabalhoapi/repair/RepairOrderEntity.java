package com.lumiere.retrabalhoapi.repair;

import com.lumiere.retrabalhoapi.employee.EmployeeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

public class RepairOrderEntity {

    @Entity
    public class RepairRecordEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // TODO: Como eu digo que este reparo pertence a UMA ordem específica?
        private RepairOrderEntity reworkOrder;

        // TODO: Como eu digo que VÁRIOS reparos podem ser feitos por UM funcionário?
        private EmployeeEntity repairEmployee;

        private LocalDateTime execAt;
        private Integer quantityRepair;
        private Integer quantityRefuse;

    }
}

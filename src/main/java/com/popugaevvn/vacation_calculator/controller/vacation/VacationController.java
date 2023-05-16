package com.popugaevvn.vacation_calculator.controller.vacation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacation")
@RequiredArgsConstructor
public class VacationControllerImpl {

private final vacationService

    @GetMapping("{avgSalary}/{vacDay}")
    VacationPayResponse getVacationPay(
            @PathVariable(name = "avgSalary") int averageSalary,
            @PathVariable(name = "vacDay") int vacationDays
    ) {
        return vacationService.calculateVacationPay(averageSalary, vacationDays);
    }

}

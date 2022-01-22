package com.test.EmployeeHireLogger.comtroller;


import com.test.EmployeeHireLogger.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.temporal.ChronoUnit;

@AllArgsConstructor
@RestController
public class Controller {

    @PostMapping(value = "/api/v1/hiring")
    public void infoHiring(@RequestBody EmployeeDto employee) {
        System.out.println(employee.getWorkingDay() + ". Сотрудник " + employee.getId()
                + " нанят " + employee.getHireTime() + ". Отдел " + employee.getDepartment());
    }

    @PostMapping(value = "/api/v1/firing")
    public void infoFiring(@RequestBody EmployeeDto employee) {
        var dayState = ChronoUnit.DAYS.between(employee.getHireTime(), employee.getFiredTime());
        System.out.println(employee.getWorkingDay() + ". Сотрудник " + employee.getId()
                + " уволен " + employee.getHireTime() + ". Отдел " + employee.getDepartment()
                + ". Проработал: " + dayState);

    }
}

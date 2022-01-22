package com.test.EmployeeHireLogger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("hire_time")
    private LocalDate hireTime;
    @JsonProperty("hire_fime")
    private LocalDate firedTime;
    @JsonProperty("department")
    private String department;
    @JsonProperty("working_day")
    private LocalDate workingDay;

}

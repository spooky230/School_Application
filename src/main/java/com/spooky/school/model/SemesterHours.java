package com.spooky.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SemesterHours {
    private int firstSemesterHours;
    private int secondSemesterHours;
}

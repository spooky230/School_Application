package com.spooky.school.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class StudyingPlan {
    private List<HashMap<Subject,SemesterHours>> studyingPlanMap;
    public StudyingPlan(){
        this.studyingPlanMap = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            studyingPlanMap.add(new HashMap<>());

        }
    }

}

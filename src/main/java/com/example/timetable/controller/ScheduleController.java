package com.example.timetable.controller;

import com.example.timetable.dto.CreateScheduleRequest;
import com.example.timetable.dto.CreateScheduleResponse;
import com.example.timetable.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public CreateScheduleResponse scheduleSave(@RequestBody CreateScheduleRequest request) {
        return scheduleService.scheduleSave(request);
    }
}

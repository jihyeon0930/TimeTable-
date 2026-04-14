package com.example.timetable.controller;

import com.example.timetable.dto.CreateScheduleRequest;
import com.example.timetable.dto.CreateScheduleResponse;
import com.example.timetable.dto.GetOneScheduleResponse;
import com.example.timetable.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public CreateScheduleResponse scheduleSave(@RequestBody CreateScheduleRequest request) {
        return scheduleService.scheduleSave(request);
    }

    @GetMapping("/schedules/{scheduleId}")
    public GetOneScheduleResponse scheduleGetOne(@PathVariable Long scheduleId) {
        return scheduleService.getOne(scheduleId);
    }

    @GetMapping("/schedules")
    public List<GetOneScheduleResponse> scheduleGetAll() {
        return scheduleService.getAll();
    }
}

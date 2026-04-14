package com.example.timetable.controller;

import com.example.timetable.dto.*;
import com.example.timetable.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponse> scheduleSave(@RequestBody CreateScheduleRequest request) {
        CreateScheduleResponse result = scheduleService.scheduleSave(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/schedules/{scheduleId}")
    public ResponseEntity<GetOneScheduleResponse> scheduleGetOne(@PathVariable Long scheduleId) {
        GetOneScheduleResponse result = scheduleService.getOne(scheduleId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<GetOneScheduleResponse>> scheduleGetAll() {
        List<GetOneScheduleResponse> result = scheduleService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping("/schedules/{scheduleId}")
    public ResponseEntity<UpdateScheduleResponse> scheduleUpdate(@RequestBody CreateScheduleRequest request, @PathVariable Long scheduleId) {
        UpdateScheduleResponse result = scheduleService.update(request, scheduleId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @DeleteMapping("/schedules/{scheduleId}")
    public ResponseEntity<Void> scheduleDelete(@RequestBody DeleteScheduleRequest request, @PathVariable Long scheduleId) {
        scheduleService.delete(request, scheduleId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

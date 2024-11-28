package com.Ashi.Roshan.controller;

import com.Ashi.Roshan.model.Software;
import com.Ashi.Roshan.service.SoftwareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/software")
@RequiredArgsConstructor
public class SoftwareController {
    private final SoftwareService softwareService;

    @PostMapping
    public Software addSoftware(@RequestBody Software software) {
        return softwareService.saveSoftware(software);
    }

    @GetMapping
    public List<Software> getAllSoftware() {
        return softwareService.getAllSoftware();
    }

    @DeleteMapping("/{id}")
    public String deleteSoftware(@PathVariable Long id) {
        softwareService.deleteSoftware(id);
        return "Software deleted successfully.";
    }
}

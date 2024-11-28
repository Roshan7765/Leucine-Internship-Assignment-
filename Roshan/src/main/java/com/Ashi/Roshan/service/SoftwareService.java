package com.Ashi.Roshan.service;

import com.Ashi.Roshan.model.Software;
import com.Ashi.Roshan.repository.SoftwareRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftwareService {
    private final SoftwareRepository softwareRepository;

    public Software saveSoftware(Software software) {
        return softwareRepository.save(software);
    }

    public List<Software> getAllSoftware() {
        return softwareRepository.findAll();
    }

    public void deleteSoftware(Long id) {
        softwareRepository.deleteById(id);
    }
}

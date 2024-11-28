package com.Ashi.Roshan.service;

import com.Ashi.Roshan.model.Request;
import com.Ashi.Roshan.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }
}

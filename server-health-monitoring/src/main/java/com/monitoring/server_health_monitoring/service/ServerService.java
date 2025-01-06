package com.monitoring.server_health_monitoring.service;

import com.monitoring.server_health_monitoring.model.Server;
import com.monitoring.server_health_monitoring.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {

    @Autowired
    private ServerRepository serverRepository;

    public List<Server> getAllServers() {
        return serverRepository.findAll();
    }

    public Server getServerById(Long id) {
        return serverRepository.findById(id).orElse(null);
    }

    public Server saveServer(Server server) {
        return serverRepository.save(server);
    }
}
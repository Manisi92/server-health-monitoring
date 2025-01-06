package com.monitoring.server_health_monitoring.controller;

import com.monitoring.server_health_monitoring.model.Server;
import com.monitoring.server_health_monitoring.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servers")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("/")
    public List<Server> getAllServers() {
        return serverService.getAllServers();
    }

    @PostMapping("/")
    public Server addServer(@RequestBody Server server) {
        return serverService.saveServer(server);
    }
}
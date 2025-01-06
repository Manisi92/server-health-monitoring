package com.monitoring.server_health_monitoring.controller;

import com.monitoring.server_health_monitoring.model.Metric;
import com.monitoring.server_health_monitoring.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metrics")
public class MetricController {

    @Autowired
    private MetricService metricService;

    @GetMapping("/")
    public List<Metric> getAllMetrics() {
        return metricService.getMetricsForServer("serverId");
    }

    @PostMapping("/")
    public Metric addMetric(@RequestBody Metric metric) {
        return metricService.saveMetric(metric);
    }
}
package com.monitoring.server_health_monitoring.service;

import com.monitoring.server_health_monitoring.model.Metric;
import com.monitoring.server_health_monitoring.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricService {

    @Autowired
    private MetricRepository metricRepository;

    public List<Metric> getMetricsForServer(String serverId) {
        return metricRepository.findAll(); // This can be extended to filter by serverId
    }

    public Metric saveMetric(Metric metric) {
        return metricRepository.save(metric);
    }
}
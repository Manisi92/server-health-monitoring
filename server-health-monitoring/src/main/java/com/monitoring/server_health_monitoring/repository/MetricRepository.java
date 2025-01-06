package com.monitoring.server_health_monitoring.repository;

import com.monitoring.server_health_monitoring.model.Metric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository extends JpaRepository<Metric, Long> {
}
package com.monitoring.server_health_monitoring.repository;

import com.monitoring.server_health_monitoring.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
}
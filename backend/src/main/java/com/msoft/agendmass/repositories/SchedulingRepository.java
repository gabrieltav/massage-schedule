package com.msoft.agendmass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msoft.agendmass.entities.Scheduling;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {

}

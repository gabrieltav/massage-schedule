package com.msoft.agendmass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msoft.agendmass.entities.Massage;

@Repository
public interface MassageRepository extends JpaRepository<Massage, Long> {

}

package com.aditya.project.dao;

import com.aditya.project.model.Basic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicDao extends JpaRepository<Basic, Integer>
{
}

package com.aditya.project.service;

import com.aditya.project.model.Basic;

import java.util.List;
import java.util.Optional;

public interface BasicService
{
    Basic save(Basic theBasic);
    List<Basic> findAll();
    Optional<Basic> findById(int id);
    void deleteById(int id);
}

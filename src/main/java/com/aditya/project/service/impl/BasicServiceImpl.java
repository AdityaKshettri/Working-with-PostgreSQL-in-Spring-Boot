package com.aditya.project.service.impl;

import com.aditya.project.dao.BasicDao;
import com.aditya.project.model.Basic;
import com.aditya.project.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasicServiceImpl implements BasicService
{
    @Autowired
    private BasicDao basicDao;

    @Override
    public Basic save(Basic theBasic) {
        return basicDao.save(theBasic);
    }

    @Override
    public List<Basic> findAll() {
        return basicDao.findAll();
    }

    @Override
    public Optional<Basic> findById(int id) {
        return basicDao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        basicDao.deleteById(id);
    }
}

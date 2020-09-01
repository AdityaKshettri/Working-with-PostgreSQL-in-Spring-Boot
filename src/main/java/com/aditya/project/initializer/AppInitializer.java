package com.aditya.project.initializer;

import com.aditya.project.model.Basic;
import com.aditya.project.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInitializer implements CommandLineRunner
{
    @Autowired
    private BasicService basicService;

    @Override
    public void run(String... args) throws Exception
    {
        Basic basic = new Basic();
        basic.setName("Aditya");
        basicService.save(basic);
    }
}

package com.example.servicefeign.clients.fallback;

import com.example.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry:" + name;
    }
}

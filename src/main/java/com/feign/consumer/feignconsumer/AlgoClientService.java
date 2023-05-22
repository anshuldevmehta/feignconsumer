package com.feign.consumer.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlgoClientService {

    @Autowired
    private APIClient apiClient;

    public String getAlgoServiceMessage()
    {
        return apiClient.pingStringController();
    }



}

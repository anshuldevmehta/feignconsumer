package com.feign.consumer.feignconsumer;

import com.feign.consumer.feignconsumer.pojo.MaiBhiPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

@Service
public class AlgoClientService {

    @Autowired
    private APIClient apiClient;

    public String getAlgoServiceMessage()
    {
        streamMapOfPojos();
        return apiClient.pingStringController();
    }

    public void streamMapOfPojos()
    {
        MaiBhiPojo mbp1 = new MaiBhiPojo(1,"A");
        MaiBhiPojo mbp2 = new MaiBhiPojo(2,"B");
        MaiBhiPojo mbp3 = new MaiBhiPojo(3,"C");
        MaiBhiPojo mbp4 = new MaiBhiPojo(4,"D");

        Map<String, MaiBhiPojo> pojoMap = new HashMap<>();
        pojoMap.put("1",mbp1);
        pojoMap.put("2",mbp2);
        pojoMap.put("3",mbp3);
        pojoMap.put("4",mbp4);

        Set<Entry<String, MaiBhiPojo>> pojoMapEntries = pojoMap.entrySet();
        Stream<Entry<String, MaiBhiPojo>> entriesStream = pojoMapEntries.stream();
        entriesStream.forEach(entry -> printPojo(entry));
    }

    private void printPojo(Entry<String, MaiBhiPojo> entry)
    {
        System.out.println("Key "+entry.getKey()+ " Value "+ entry.getValue());
    }



}

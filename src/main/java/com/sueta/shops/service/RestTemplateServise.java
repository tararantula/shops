package com.sueta.shops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
@Service
public class RestTemplateServise {
    @Autowired
    RestTemplate restTemplate;


    public void OrderFromWarehouses(Integer idProductFromWarehouse, int number, String name, String description) {
        restTemplate.exchange("http://localhost:7070/warehousesAndFactories/productDelivery/{idProductFromWarehouse}&{number}&{name}&{description}", HttpMethod.POST, null, String.class,idProductFromWarehouse, number, name, description);
    }
}

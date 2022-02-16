package com.herberth.barrientos.market.domain.service;

import com.herberth.barrientos.market.domain.Purchase;
import com.herberth.barrientos.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase>getAll(){
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByCliente (String clientId){
        return  purchaseRepository.getByClient(clientId);
    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }


}

package com.example.sheepopfood.service;

import com.example.sheepopfood.model.Bill;
import com.example.sheepopfood.repository.BillRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BillService {
    private final BillRepository billRepository;
    public void save(Bill bill){
        billRepository.save(bill);
    }
}

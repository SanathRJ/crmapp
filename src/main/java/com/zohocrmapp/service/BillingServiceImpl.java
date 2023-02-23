package com.zohocrmapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billRepo;

@Override
public void saveBill(Billing bill) {
	billRepo.save(bill);
	
}

@Override
public List<Billing> getAllBills() {
	List<Billing> bills = billRepo.findAll();
	return bills;
}
}

package com.zohocrmapp.service;

import java.util.List;

import com.zohocrmapp.entities.Billing;

public interface BillingService {

	void saveBill(Billing bill);

	List<Billing> getAllBills();

}

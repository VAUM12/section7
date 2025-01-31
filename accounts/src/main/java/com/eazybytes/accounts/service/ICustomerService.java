package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import com.eazybytes.accounts.repository.AccountsRepository;

public interface ICustomerService {

    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}

package com.furkanarslan.services.impl;

import com.furkanarslan.dto.DtoAddress;
import com.furkanarslan.dto.DtoCustomer;
import com.furkanarslan.entites.Address;
import com.furkanarslan.repository.IAddressRepository;
import com.furkanarslan.services.IAddressServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServices implements IAddressServices {
@Autowired
private IAddressRepository iAddressRepository;
    @Override
    public DtoAddress findAddressById(long id) {
DtoAddress dtoAddres = new DtoAddress();
        Optional<Address> optional = iAddressRepository.findById(id);
if (optional.isEmpty()) {
    return null;
}
Address address = optional.get();
        BeanUtils.copyProperties(address, dtoAddres);
        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
       // dtoCustomer.setDtoAddress(dtoAddres);
dtoAddres.setDtoCustomer(dtoCustomer);

return dtoAddres;
    }
}

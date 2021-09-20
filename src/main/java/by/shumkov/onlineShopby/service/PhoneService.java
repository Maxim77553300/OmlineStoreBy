package by.shumkov.onlineShopby.service;

import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.entity.PnoneNameisExistsException;

import java.util.List;

public interface PhoneService {

    List<Phone> findAllPhone(String phoneName);

    List<Phone> findByName(String name);

    Phone addNewPhone(Phone phone) throws PhoneServiceException;
   // Phone addPhone(Phone phone) throws PnoneNameisExistsException;


}

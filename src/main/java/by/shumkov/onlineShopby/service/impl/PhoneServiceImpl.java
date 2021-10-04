package by.shumkov.onlineShopby.service.impl;

import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.repository.PhoneRepository;
import by.shumkov.onlineShopby.service.PhoneService;
import by.shumkov.onlineShopby.service.PhoneServiceException;
import by.shumkov.onlineShopby.service.constant.PhoneServiceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneServiceImpl implements PhoneService {
    private PhoneRepository phoneRepository;


    @Autowired // spring сам сюда подставит объекты PhoneService
    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }


    //поиск всех тел
    @Override
    public List<Phone> findAllPhone(String phoneName) {
        if(isStringEqualNullOrBlank(phoneName)){
            return phoneRepository.findAll();
        }
        String redactedName = "%" + phoneName + "%";
        return phoneRepository.findPhoneByNameIsLike(redactedName);
    }

    @Override
    public List<Phone> findByName(String name) {
        String redactedName = "%" + name + "%";
        return phoneRepository.findPhoneByNameIsLike(redactedName);
    }

    @Override
    public Phone addNewPhone(Phone phone) throws PhoneServiceException {
        Optional<Phone> findPhone = phoneRepository.findPhoneByName(phone.getName());
        if(findPhone.isPresent()){
            throw new PhoneServiceException(PhoneServiceConstant.PHONE_NAME_IS_TEXT_EXCEPTION);
        } else {
            return phoneRepository.save(phone);
        }

    }

    private boolean isStringEqualNullOrBlank(String text){
        return text == null||text.isEmpty();
    }


    //создание нового тел
//    public Phone addPhone(Phone phone) throws PnoneNameisExistsException {
//        //проверяем -существует ли тел с таким названием
//       Optional<Phone> phoneByName = phoneRepository.findPhoneByName(phone.getName());
//        // если нашли книгу с таким названием мы не разрешаем добавить, бросаем исключение
//        if(phoneByName==null){
//            return phoneRepository.save(phone);
//        } else {
//            throw new PnoneNameisExistsException("Phone name is alredy exists");
//        }
//    }
}



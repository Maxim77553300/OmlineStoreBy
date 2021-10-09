package by.shumkov.onlineShopby.controller;

import by.shumkov.onlineShopby.entity.Phone;
import org.springframework.ui.Model;

public interface PhoneController {

    String findAllPhone(String phoneName, Model model);

    String create(Phone phone, Model model);


}

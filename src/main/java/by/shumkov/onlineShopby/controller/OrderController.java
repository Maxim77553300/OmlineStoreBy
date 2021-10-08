package by.shumkov.onlineShopby.controller;

import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.entity.User;
import org.springframework.ui.Model;

public interface OrderController {

    String showOrder(User user, Model model);

    String createOrder(User user, Phone phone, Model model);

}

package by.shumkov.onlineShopby.controller.impl;

import by.shumkov.onlineShopby.controller.PhoneController;
import by.shumkov.onlineShopby.controller.constant.PhoneControllerConstant;
import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.entity.PnoneNameisExistsException;
import by.shumkov.onlineShopby.entity.User;
import by.shumkov.onlineShopby.repository.PhoneRepository;
import by.shumkov.onlineShopby.service.PhoneService;
import by.shumkov.onlineShopby.service.PhoneServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PhoneControllerImpl implements PhoneController {
    private PhoneService phoneService;

    @Autowired
    public PhoneControllerImpl(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

  // spring сам подставит объекты
//    @Autowired
    @GetMapping("/")
    public String welcomePage(){
        return "welcomePage";
    }


    // get запрос на получение списка книг
    @GetMapping("/phones")//localhost:8080/phones
    public String findAllPhone(@RequestParam(required = false) String phoneName,  Model model) {
        //Model для работы с фронтэндом
        // вызов метода сервиса
        List<Phone> allPhones = phoneService.findAllPhone(phoneName);
        // добавляем список телефонов в модель для передачи на страницу
        model.addAttribute("phones", allPhones);
        // resources/templates/books.html
        return "phones";

        //return phoneRepository.findAll();

    }

    @Override
    @PostMapping("/create")
    public String create(@Validated  Phone phone,Model model) {
        try {
            Phone newPhone = phoneService.addNewPhone(phone);
            return "redirect:/";
        } catch (PhoneServiceException e) {
             model.addAttribute("error",e.getMessage());
             model.addAttribute("createNewPhone",phoneService.findAllPhone(PhoneControllerConstant.EMPTY_STR));
             return "createNewPhone";
        }



    }


    //@PreAuthorize("hasAuthority('Admin')")
    @GetMapping("/create")
    public String forwardCreatePhone(@AuthenticationPrincipal User user){
        return "createNewPhone";
    }


//    @GetMapping("/create")
//    public String forwardCreatePhone(){
//        return "createNewPhone";
//    }




    // post - запрос для создания новой книги
//    @PostMapping
//    public String createNewPhone(@Validated Phone phone, Model model) { // проверяем валидность объекта -логику задаем в классе phone
//        try {
//            phoneService.addPhone(phone);
//            return "redirect:phones"; // если книга добавлена - то идет редирект на стр Phone (чтобы отбразилась новая книга)
//
//        } catch (PnoneNameisExistsException exception) {  // если произошла ошибка -телефон с таким названием уже есть
//            model.addAttribute("error", exception.getMessage()); //добавили инфу об ошибке
//            model.addAttribute("phones", phoneService.findAllPhone());
//
//            return "phones";
//        }
//    }
}

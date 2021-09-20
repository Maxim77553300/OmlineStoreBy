package by.shumkov.onlineShopby.repository;

import by.shumkov.onlineShopby.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


//замена DAO
// сами запросы в БД я не пишу

public interface PhoneRepository extends JpaRepository<Phone,Integer> {

     List<Phone> findPhoneByNameIsLike(String name);

     Optional<Phone> findPhoneByName(String name);

}

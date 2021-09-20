package by.shumkov.onlineShopby.entity;

public class PnoneNameisExistsException extends Exception{

    public PnoneNameisExistsException(String phone_name_is_alredy_exists) {
        System.out.println(phone_name_is_alredy_exists);
    }
}

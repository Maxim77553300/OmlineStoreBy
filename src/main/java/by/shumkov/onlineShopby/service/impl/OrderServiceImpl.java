//package by.shumkov.onlineShopby.service.impl;
//
//import by.shumkov.onlineShopby.entity.Order;
//import by.shumkov.onlineShopby.entity.Phone;
//import by.shumkov.onlineShopby.entity.User;
//import by.shumkov.onlineShopby.repository.OrderRepository;
//import by.shumkov.onlineShopby.service.OrderService;
//import by.shumkov.onlineShopby.service.OrderServiceException;
//import by.shumkov.onlineShopby.service.PhoneServiceException;
//import by.shumkov.onlineShopby.service.constant.PhoneServiceConstant;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//
//@Service
//public class OrderServiceImpl implements OrderService {
//
//    private OrderRepository orderRepository;
//
//    @Autowired
//    public OrderServiceImpl(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @Override
//    public List<Phone> findAllOrders(User user) {
//        return null;
//    }
//
//    @Override
//    public List<Phone> findByNumberOfOrder(String number) {
//        return null;
//    }
//
//    @Override
//    public Order addNewOrder(Order order) throws OrderServiceException{
//        Optional<Order> findById = orderRepository.findById(order.getId());
//        if(findById.isPresent()){
//            throw new OrderServiceException("!!! This order is already exist!! You can add goods to your order");
//        } else {
//            return orderRepository.save(order);
//        }
//    }
//}

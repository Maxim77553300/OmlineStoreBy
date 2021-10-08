//package by.shumkov.onlineShopby.entity;
//
//import javax.persistence.*;
//import javax.persistence.criteria.CriteriaBuilder;
//
//@Entity
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "order_id")
//    private Integer order_id;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "product_id")
//    private Integer product_id;
//    @Column(name = "count")
//    private Integer count;
//    @Column(name = "price")
//    private Double price;
//
//
//    public Integer getOrder_id() {
//        return order_id;
//    }
//
//    public void setOrder_id(Integer order_id) {
//        this.order_id = order_id;
//    }
//
//    public Integer getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(Integer product_id) {
//        this.product_id = product_id;
//    }
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//}

//package by.shumkov.onlineShopby.entity;
//
//import javax.persistence.*;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.validation.constraints.NotBlank;
//import java.util.Date;
//
//
//@Entity
//@Table(name = "order")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private Integer user_id;
//
//    @Column(name = "datetime")
//    private Date date;
//    @Column(name = "pay_status")
//    private boolean payStatus;
//
//
//
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(Integer user_id) {
//        this.user_id = user_id;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Boolean getPayStatus() {
//        return payStatus;
//    }
//
//    public void setPayStatus(Boolean payStatus) {
//        this.payStatus = payStatus;
//    }
//}

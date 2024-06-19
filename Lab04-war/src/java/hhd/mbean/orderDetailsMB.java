/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhd.mbean;

import hhd.entities.OrderDetails;
import hhd.entities.OrderDetailsPK;
import hhd.entities.Orders;
import hhd.entities.Products;
import hhd.sessionbeans.OrderDetailsFacadeLocal;
import hhd.sessionbeans.OrdersFacadeLocal;
import hhd.sessionbeans.ProductsFacadeLocal;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author STUDENT
 */
@Named(value = "orderDetailsMB")
@RequestScoped
public class orderDetailsMB {

    @EJB
    private OrdersFacadeLocal ordersFacade;

    @EJB
    private ProductsFacadeLocal productsFacade;

    @EJB
    private OrderDetailsFacadeLocal orderDetailsFacade;

    private int orderID;
    private int productID;
    private String unitPrice;
    private int quantity;
    private double discount;
    private String msg;
    /**
     * Creates a new instance of orderDetailsMB
     */
    public orderDetailsMB() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public List<Orders> showOrders(){
        return ordersFacade.findAll();
    }
    public List<Products> showProducts(){
        return productsFacade.findAll();
    }
    public void insertOder(){
        msg = "Inserted new order details success !";
        OrderDetailsPK oPK = new OrderDetailsPK(orderID,productID);
        OrderDetails oDT = new OrderDetails(oPK,new BigDecimal(Double.parseDouble(unitPrice)), (short)quantity, (float) discount);
        orderDetailsFacade.create(oDT);
    }
    
}

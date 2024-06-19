/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhd.mbean;

import hhd.entities.Shippers;
import hhd.sessionbeans.ShippersFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author STUDENT
 */
@Named(value = "shippersMB")
@RequestScoped
public class ShippersMB {

    @EJB
    private ShippersFacadeLocal shippersFacade;
    private int shipperId;
    private String companyName;
    private String phone;
    private List<Shippers> listShippers;
    /**
     * Creates a new instance of ShippersMB
     */
    public ShippersMB() {
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Shippers> getListShippers() {
        return listShippers;
    }

    public void setListShippers(List<Shippers> listShippers) {
        this.listShippers = listShippers;
    }
    // get list
    public List<Shippers> getList(){
        return shippersFacade.findAll();
    }
    //  add shipper
    public String addShipper(){
        Shippers shipper = new Shippers();
        shipper.setCompanyName(companyName);
        shipper.setPhone(phone);
        try{
            shippersFacade.create(shipper);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        listShippers = shippersFacade.findAll();
        return "viewShippers";
    }
    // edit shipper
    public String editShipper(int id){
        Shippers shipper = shippersFacade.find(id);
        shipperId = shipper.getShipperID();
        companyName = shipper.getCompanyName();
        phone = shipper.getPhone();
        return "editShipper";
    }
     public String editShipper(){
         Shippers shipper = shippersFacade.find(shipperId);
         shipper.setCompanyName(companyName);
         shipper.setPhone(phone);
         shippersFacade.edit(shipper);
         return "viewShippers";
     }
    // delete shipper
     public String deleteShipper(int id){
         Shippers shipper = shippersFacade.find(id);
         shippersFacade.remove(shipper);
         return "viewShippers";
     }
     // find shipper by id
     public void findShipperById(){
         listShippers = shippersFacade.findShipperById(shipperId);
     }
}

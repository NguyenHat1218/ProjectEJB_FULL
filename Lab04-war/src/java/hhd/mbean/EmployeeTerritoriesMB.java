/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhd.mbean;

import hhd.entities.Employees;
import hhd.entities.Territories;
import hhd.sessionbeans.EmployeesFacadeLocal;
import hhd.sessionbeans.TerritoriesFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author STUDENT
 */
@Named(value = "employeeTerritoriesMB")
@RequestScoped
public class EmployeeTerritoriesMB {

    @EJB
    private TerritoriesFacadeLocal territoriesFacade;

    @EJB
    private EmployeesFacadeLocal employeesFacade;

    private String employeeId;
    private String terriId;
    private String msg;
    
    /**
     * Creates a new instance of EmployeeTerritoriesMB
     */
    public EmployeeTerritoriesMB() {
        
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    

    public String getTerriId() {
        return terriId;
    }

    public void setTerriId(String terriId) {
        this.terriId = terriId;
    }

    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    // add employee
    public void addEmployeeTerritories(){
        System.out.println(employeeId);
        System.out.println(terriId);
        Employees emp = employeesFacade.find(Integer.parseInt(employeeId));
        emp.getTerritoriesCollection().add(territoriesFacade.find(terriId));
        employeesFacade.edit(emp);
        msg = "Insert successfully !";
    }
    //show list employee
    public List<Employees> showEmployees(){
        return employeesFacade.findAll();
    }
    //show list territories
    public List<Territories> showTerritories(){
        return territoriesFacade.findAll();
    }
}

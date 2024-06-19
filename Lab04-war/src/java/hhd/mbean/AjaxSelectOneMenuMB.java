/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhd.mbean;

import hhd.entities.Region;
import hhd.entities.Territories;
import hhd.sessionbeans.RegionFacadeLocal;
import hhd.sessionbeans.TerritoriesFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author STUDENT
 */
@Named(value = "ajaxSelectOneMenuMB")
@RequestScoped
public class AjaxSelectOneMenuMB {

    @EJB
    private TerritoriesFacadeLocal territoriesFacade;

    @EJB
    private RegionFacadeLocal regionFacade;
    private int selectedRegion;
    private String selectedTerritories;
    List<Territories> listTerritories = new ArrayList();
    
    public AjaxSelectOneMenuMB() {
    }
    
    public List<Territories> territoriesSpecialities(){
        return listTerritories;
    }
    
    public void changeRegion(){
        Region region = regionFacade.find(selectedRegion);
        listTerritories = (List<Territories>) region.getTerritoriesCollection();
    }
    public List<Region> showAllRegion(){
        return regionFacade.findAll();
    }

    public int getSelectedRegion() {
        return selectedRegion;
    }

    public void setSelectedRegion(int selectedRegion) {
        this.selectedRegion = selectedRegion;
    }

    public String getSelectedTerritories() {
        return selectedTerritories;
    }

    public void setSelectedTerritories(String selectedTerritories) {
        this.selectedTerritories = selectedTerritories;
    }
    
    
    
    
}

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
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author STUDENT
 */
@Named(value = "territoriesMB")
@RequestScoped
public class TerritoriesMB {

    @EJB
    private RegionFacadeLocal regionFacade;

    @EJB
    private TerritoriesFacadeLocal territoriesFacade;
    
    private int regionID;
    private String territoryID;
    private String territoryDescription;
    
    /**
     * Creates a new instance of TerritoriesMB
     */
    public TerritoriesMB() {
    }
    // show list region
    public List<Region> showAllRegion(){
        return regionFacade.findAll();
    }
    public List<Territories> showTerritoriesByRegionId(){
        Region region = regionFacade.find(1);
        return (List<Territories>) region.getTerritoriesCollection();
    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public String getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(String territoryID) {
        this.territoryID = territoryID;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }
    public String addNewTerritories(){
        Territories terri = new Territories(territoryID,territoryDescription);
        terri.setRegionID(regionFacade.find(regionID));
        territoriesFacade.create(terri);
        return "viewRegion";
    }
    
}

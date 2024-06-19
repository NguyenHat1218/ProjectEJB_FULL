package hhd.entities;

import hhd.entities.Employees;
import hhd.entities.Region;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Territories.class)
public class Territories_ { 

    public static volatile CollectionAttribute<Territories, Employees> employeesCollection;
    public static volatile SingularAttribute<Territories, String> territoryDescription;
    public static volatile SingularAttribute<Territories, Region> regionID;
    public static volatile SingularAttribute<Territories, String> territoryID;

}
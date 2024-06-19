package hhd.entities;

import hhd.entities.Territories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Region.class)
public class Region_ { 

    public static volatile CollectionAttribute<Region, Territories> territoriesCollection;
    public static volatile SingularAttribute<Region, Integer> regionID;
    public static volatile SingularAttribute<Region, String> regionDescription;

}
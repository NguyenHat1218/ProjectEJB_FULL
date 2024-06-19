package hhd.entities;

import hhd.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile CollectionAttribute<Categories, Products> productsCollection;
    public static volatile SingularAttribute<Categories, String> description;
    public static volatile SingularAttribute<Categories, String> categoryName;
    public static volatile SingularAttribute<Categories, Integer> categoryID;
    public static volatile SingularAttribute<Categories, byte[]> picture;

}
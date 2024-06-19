package hhd.entities;

import hhd.entities.Categories;
import hhd.entities.OrderDetails;
import hhd.entities.Suppliers;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Products, Short> unitsInStock;
    public static volatile SingularAttribute<Products, Short> reorderLevel;
    public static volatile SingularAttribute<Products, Suppliers> supplierID;
    public static volatile SingularAttribute<Products, Integer> productID;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Products, String> quantityPerUnit;
    public static volatile SingularAttribute<Products, Boolean> discontinued;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, Short> unitsOnOrder;
    public static volatile SingularAttribute<Products, Categories> categoryID;

}
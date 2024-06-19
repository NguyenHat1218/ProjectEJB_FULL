package hhd.entities;

import hhd.entities.Customers;
import hhd.entities.Employees;
import hhd.entities.OrderDetails;
import hhd.entities.Shippers;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, String> shipCity;
    public static volatile SingularAttribute<Orders, Integer> orderID;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, BigDecimal> freight;
    public static volatile SingularAttribute<Orders, Date> requiredDate;
    public static volatile SingularAttribute<Orders, Employees> employeeID;
    public static volatile SingularAttribute<Orders, String> shipName;
    public static volatile SingularAttribute<Orders, String> shipPostalCode;
    public static volatile SingularAttribute<Orders, String> shipCountry;
    public static volatile SingularAttribute<Orders, String> shipAddress;
    public static volatile SingularAttribute<Orders, Shippers> shipVia;
    public static volatile SingularAttribute<Orders, Customers> customerID;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, Date> shippedDate;
    public static volatile SingularAttribute<Orders, String> shipRegion;

}
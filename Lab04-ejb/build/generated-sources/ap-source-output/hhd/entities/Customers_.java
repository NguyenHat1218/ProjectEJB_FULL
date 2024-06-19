package hhd.entities;

import hhd.entities.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-26T12:36:58")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> country;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> contactTitle;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, String> phone;
    public static volatile SingularAttribute<Customers, String> contactName;
    public static volatile SingularAttribute<Customers, String> companyName;
    public static volatile SingularAttribute<Customers, String> postalCode;
    public static volatile SingularAttribute<Customers, String> customerID;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile SingularAttribute<Customers, String> region;
    public static volatile SingularAttribute<Customers, String> fax;

}
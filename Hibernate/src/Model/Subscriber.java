package Model;
// Generated 14/03/2020 09:49:56 PM by Hibernate Tools 4.3.1



/**
 * Subscriber generated by hbm2java
 */
public class Subscriber  implements java.io.Serializable {


     private Integer id;
     private String subscriberId;
     private String firstName;
     private String lastName;

    public Subscriber() {
    }

    public Subscriber(String subscriberId, String firstName, String lastName) {
       this.subscriberId = subscriberId;
       this.firstName = firstName;
       this.lastName = lastName;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSubscriberId() {
        return this.subscriberId;
    }
    
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Model.*;

/**
 *
 * @author Eddie Pincay
 */

public class Operations {
    
    public void newSubscriber(Subscriber subscribe)
    {
        SessionFactory sessions = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessions.openSession();
        Transaction tx = session.beginTransaction();
        session.save(subscribe);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insert Correct");
    }
}

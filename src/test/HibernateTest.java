package test;

import db.HibernateUtil;
import model.Lecturer;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import javax.management.Query;
import java.util.List;

/**
 * Created by Ibrahim.mmh on 5/4/2018.
 */
public class HibernateTest {

    public static void main(String[] args) {
        //insert  --------------------------------------------------------
        Lecturer lecturer1 = new Lecturer("Ahmed","Ibrahim");
        HibernateUtil.hibernateTrx(lecturer1, "insert", 0);
        System.out.println("The lecturer " + lecturer1 + " is successfully added to your database");
        lecturer1 = null;
        //update  --------------------------------------------------------
        lecturer1 = new Lecturer("Rahma","Nada");
        lecturer1.setId(2);
//        HibernateUtil.hibernateTrx(lecturer1, "update", 2);
        //-----------------------------------------
        HibernateUtil.hibernatePrivateTrx(lecturer1,"update lecturer set fname='"+lecturer1.getFirstName()+"',lname='"+lecturer1.getLastName()+"',startdate='"+lecturer1.getStartdate()+"' where id=2");
        //-----------------------------------------
        System.out.println("The lecturer " + lecturer1 + " is successfully updated to your database");
        //lecturer1 = null;
        //delete  --------------------------------------------------------
        //-----------------------------------------
        HibernateUtil.hibernatePrivateTrx(lecturer1,"DELETE from lecturer where id > 8 ");
        //-----------------------------------------
//        HibernateUtil.hibernateTrx(new Lecturer(), "delete", 3);
        System.out.println("The lecturer is successfully deleted from your database");
        lecturer1 = null;
        //select all  --------------------------------------------------------
        List<Lecturer>  lines = HibernateUtil.getAllByHQL("from Lecturer order by fname,startdate");
        for (Lecturer lecturer : lines)
            System.out.println("The lecturer " + lecturer + " is successfully retrieved from your database");
        //select one  --------------------------------------------------------
        lecturer1 = HibernateUtil.getOneByID(new Lecturer(),1);
        System.out.println("The lecturer " + lecturer1 + " is successfully retrieved from your database");
        lecturer1 = null;
    }
}
package com.HibernateProject.HibernateProject;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();*/
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student st=new Student();
        st.setId(2);
        st.setName("ramesh");
        st.setRoll_no("26");
        org.hibernate.Session session= factory.openSession();
        org.hibernate.Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        Student s1 =session.get(Student.class,1);
        System.out.println(s1);
        session.close();
        System.out.println(factory);
        System.out.println(factory.isOpen());
    }
}

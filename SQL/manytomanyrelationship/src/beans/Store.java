package beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {
	public static void main(String[] args) {
		//Add Readers
		ArrayList<ReaderEntity> rlist=new ArrayList<ReaderEntity>();
		
		 
		// Reader List
		ReaderEntity readerone=new ReaderEntity();
		readerone.setReaderName("Kanika");
		rlist.add(readerone);
		ReaderEntity readertwo=new ReaderEntity();
		readertwo.setReaderName("Mahesh");
		rlist.add(readertwo);
		
		//List of Subscriptions
		
		Set<SubscriptionEntity> slist=new HashSet<SubscriptionEntity>();
				
		SubscriptionEntity	sone=new SubscriptionEntity();
		  sone.setSubsname("primevideo");
		  SubscriptionEntity  stwo=new SubscriptionEntity();
	     stwo.setSubsname("hotstar");
	     SubscriptionEntity sthree=new SubscriptionEntity();
	     sthree.setSubsname("Disney");
	     
	     slist.add(sone);
	     slist.add(stwo);
	     slist.add(sthree);
	     
	     
	     
	     
	     readerone.setSubscriptions(slist);    
	     readertwo.setSubscriptions(slist);
	     
	    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(readerone);
		session.save(readertwo);
		
		session.getTransaction().commit();
	}

}

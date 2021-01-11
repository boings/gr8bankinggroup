package layers.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import layers.domain.CreditCard;
import layers.util.HibernateUtil;

@Service
public class CreditCardDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void main(String[] args) {
		int input = 1;
		statusOfCards(input);
	}

	public CreditCardDAO() {
		// TODO Auto-generated constructor stub
	}

	public void numberOfCardRequests(int time) {
		// TODO Auto-generated method stub

	}

	public void statusOfCards(int customerID) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		//Transaction transaction = null;
		Criteria criteria = session.createCriteria(CreditCard.class);
		criteria.add(Restrictions.eq("customer_id", customerID));
		List<CreditCard> ccList = criteria.list();
		for(CreditCard c: ccList){
			System.out.println(c.getStatus());
		}
		
		
	}

	public void numberOfCCForCust(int customerID) {
		// TODO Auto-generated method stub
		
	}

	public void numberOfCCRejected(int type) {
		// TODO Auto-generated method stub
		
	}

	public void viewStatement(int type, int iD) {
		// TODO Auto-generated method stub
		
	}

	public void useagePatternForCustID(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void limitsForCust(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void paymentHistory(int iD, int type) {
		// TODO Auto-generated method stub
		
	}

	public void AvgTimeToDecide() {
		// TODO Auto-generated method stub
		
	}

	public void Expiring(int iD, int time) {
		// TODO Auto-generated method stub
		
	}

	public void RegionalUseage(int type) {
		// TODO Auto-generated method stub
		
	}

	public void RegionalSale(int type) {
		// TODO Auto-generated method stub
		
	}

	public void DiscontinuedCards(int iD) {
		// TODO Auto-generated method stub
		
	}

}

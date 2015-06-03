package co.com.udem.trabajo1.DAO.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.udem.trabajo1.DAO.MachinesDAO;
import co.com.udem.trabajo1.domain.Machines;


@Repository
public class MachinesDAOImpl implements MachinesDAO{

	

	@Autowired
	private SessionFactory sessionFactory;

	public List<Machines> getMachinesList() {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Machines");
		
		@SuppressWarnings("unchecked")
		List<Machines> listMachines= (List<Machines>) query.list();
			
		return listMachines;
	}

	public boolean CreateMachine(Machines machines) {
		Session session = sessionFactory.getCurrentSession();
		if(session.save(machines) != null){
			return true;
		}else{
			return false;
		}
	}

	public boolean UpdateMachine(Machines machines) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(machines);
		return true;
	}


	public boolean DeleteMachine(int id) {
		Session session = sessionFactory.getCurrentSession();
		//Query query = session.createQuery("UPDATE Machines  SET availabilityMachine ='Si' WHERE id=" + id );
		
		Query query = session.createQuery("DELETE FROM Machines WHERE id=" + id);
		if (query.executeUpdate()==1) {
			return true;
		}else{
			return false;
		}

		
	}

	@SuppressWarnings("unchecked")
	public List<Machines> ReadMachine(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Machines  WHERE id =" + id );
		
		List<Machines> listMachines= (List<Machines>) query.list();
		
	
		return listMachines;

	}

	public List<Machines> SearchMachine(String wordMachine) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Machines where nameMachine LIKE '%"+ wordMachine+"%'");
		
		@SuppressWarnings("unchecked")
		List<Machines> listMachines= (List<Machines>) query.list();
	
		
		return listMachines;
	}

}

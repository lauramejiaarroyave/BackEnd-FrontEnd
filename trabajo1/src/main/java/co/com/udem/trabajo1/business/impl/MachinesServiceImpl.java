package co.com.udem.trabajo1.business.impl;

import java.util.List;

import javassist.expr.NewArray;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.trabajo1.DAO.MachinesDAO;
import co.com.udem.trabajo1.DTO.MachinesDTO;
import co.com.udem.trabajo1.business.MachinesService;
import co.com.udem.trabajo1.domain.Machines;



@Service
public class MachinesServiceImpl implements MachinesService{

	
	@Autowired
	private MachinesDAO machinesDAO;
	
	@Transactional
	public List<Machines> getMachinesList() {

		List<Machines> machines= machinesDAO.getMachinesList();
					
		return machines;
		
	}

	@Transactional	
	public boolean CreateMachine(Machines machines) {
		
		return machinesDAO.CreateMachine(machines);
	
	}

	@Transactional	
	public boolean UpdateMachine(Machines machines) {
		
		return machinesDAO.UpdateMachine(machines);
	}

	@Transactional	
	public boolean DeleteMachine(int id) {

		return machinesDAO.DeleteMachine(id);
		
	}


	@Transactional	
	public MachinesDTO ReadMachine(int id) {

		double finalPrice=0;
		double savePrice=0;
		
	 List<Machines> machines=  machinesDAO.ReadMachine(id);
		
		for (Machines machine : machines) {
			
			savePrice=machine.getPriceMachine() * ((machine.getDiscountMachine())/100);
			finalPrice = machine.getPriceMachine() - savePrice;
		}
		
		Machines mach= machines.get(0);
		
		
		
		MachinesDTO machinesDTO= new MachinesDTO(id, mach.imageMachine, mach.nameMachine, mach.priceMachine, mach.discountMachine, mach.descriptionMachine, mach.availabilityMachine, savePrice, finalPrice);
		
		//return (List<Machines>) machinesDAO.ReadMachine(id);
		return machinesDTO;
	}

	@Transactional
	public List<Machines> SearchWord(String wordMachine) {

		
		return (List<Machines>) machinesDAO.SearchMachine(wordMachine);
		
	}



}

package co.com.udem.trabajo1.business;

import java.util.List;

import co.com.udem.trabajo1.DTO.MachinesDTO;
import co.com.udem.trabajo1.domain.Machines;

public interface MachinesService {
	
	public List<Machines> getMachinesList();
	public boolean CreateMachine(Machines machines);
	public boolean UpdateMachine(Machines machines);
	public boolean DeleteMachine(int id);
	public MachinesDTO ReadMachine(int id);
	
	public List<Machines> SearchWord(String wordMachine);

}

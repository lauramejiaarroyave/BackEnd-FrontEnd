package co.com.udem.trabajo1.DAO;

import java.util.List;

import co.com.udem.trabajo1.domain.Machines;

public interface MachinesDAO {
	
	public List<Machines> getMachinesList();
	public boolean CreateMachine(Machines machines);
	public boolean UpdateMachine(Machines machines);
	public boolean DeleteMachine(int id);
	public List<Machines> ReadMachine(int id);
	
	public List<Machines> SearchMachine(String wordMachine);

}

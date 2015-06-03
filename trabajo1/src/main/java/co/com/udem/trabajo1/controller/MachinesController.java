package co.com.udem.trabajo1.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.trabajo1.DTO.MachinesDTO;
import co.com.udem.trabajo1.business.MachinesService;
import co.com.udem.trabajo1.domain.Machines;



@Controller
@RequestMapping("/machines")
public class MachinesController {

	@Autowired
	public MachinesService machinesService;
	
	
	@RequestMapping("/List")
	
	public ModelAndView MachinesViewList(){
		List<Machines> machines = machinesService.getMachinesList();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("machines", machines);
		
		return mv;
		
	}
	
	
	@RequestMapping("/Detail")
	
	public ModelAndView MachinesViewDetail(int id){
		
		ModelAndView mv = new ModelAndView();
				
		mv.addObject("machines", machinesService.ReadMachine(id));
		
		return mv;
			
		
	}	
	
	@RequestMapping("/MachinesList")
	public @ResponseBody List<Machines> MachinesList(){
		

		List<Machines> machines = machinesService.getMachinesList();
		
		
		return machines;
	}	
	
	@RequestMapping("/SearchWord")
	public @ResponseBody List<Machines> SearchWord(@RequestParam (value = "wordMachine", required = true )String wordMachine){
		

		List<Machines> machines = machinesService.SearchWord(wordMachine);
		
		return machines;
	}	
	
	
	
	@RequestMapping("/CreateMachine")
	public @ResponseBody String CreateMachine( 
			@RequestParam (value = "imageMachine", required = true )String imageMachine, 
			@RequestParam (value = "nameMachine", required = true )String nameMachine,
			@RequestParam (value = "priceMachine", required = true )Double priceMachine,
			@RequestParam (value = "discountMachine", required = true )Double discountMachine,
			@RequestParam (value = "descriptionMachine", required = true )String descriptionMachine,
			@RequestParam (value = "availabilityMachine", required = true )String availabilityMachine
			)
	{
		Machines machine = new Machines(0, imageMachine, nameMachine,priceMachine,discountMachine, descriptionMachine, availabilityMachine);
		
		if(machinesService.CreateMachine(machine)==false){
			String er= "{\"status\":\"error\"}";
			return er;
		}else {
			String suc= "{\"status\":\"success\"}";
			return suc;
		
		}	
	}	
	
	
	@RequestMapping("/UpdateMachine")
	public @ResponseBody boolean UpdateMachine( 
			@RequestParam (value = "imageMachine", required = true )String imageMachine, 
			@RequestParam (value = "nameMachine", required = true )String nameMachine,
			@RequestParam (value = "priceMachine", required = true )Double priceMachine,
			@RequestParam (value = "discountMachine", required = true )Double discountMachine,
			@RequestParam (value = "descriptionMachine", required = true )String descriptionMachine,
			@RequestParam (value = "availabilityMachine", required = false )String availabilityMachine,
			@RequestParam (value = "id", required = true )int id)
			{
		
				return machinesService.UpdateMachine(new Machines(id, imageMachine, nameMachine, priceMachine, discountMachine, descriptionMachine, availabilityMachine));
			}
	
	
	
	@RequestMapping("/DeleteMachine")
	public @ResponseBody String DeleteMachine(
			@RequestParam (value = "id", required = true )int id)
	{
		
		if (machinesService.DeleteMachine(id)==false) {
			String er= "{\"status\":\"error\"}";
			return er;
		}else {
			String suc= "{\"status\":\"success\"}";
			return suc;
		
		}

	}
	
	@RequestMapping ("/ReadMachine")
	public @ResponseBody MachinesDTO ReadMachine(
			@RequestParam (value = "id", required = true )int id)
	{
		
	
		return machinesService.ReadMachine(id);
		
	}
	

}
	
	
	
	

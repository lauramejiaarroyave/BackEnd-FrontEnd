package co.com.udem.trabajo1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Machines {
	
	
	@Id
	public int id;
	public String imageMachine;
	public String nameMachine;
	public Double priceMachine;
	public Double discountMachine;
	public String descriptionMachine;
	public String availabilityMachine;
	
	public Machines(int id, String imageMachine, String nameMachine,
			Double priceMachine, Double discountMachine,
			String descriptionMachine, String availabilityMachine) {
		super();
		this.id = id;
		this.imageMachine = imageMachine;
		this.nameMachine = nameMachine;
		this.priceMachine = priceMachine;
		this.discountMachine = discountMachine;
		this.descriptionMachine = descriptionMachine;
		this.availabilityMachine = availabilityMachine;
	}

	public Machines(){
		super();
	}
	
	public Machines(int id){
		super();
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageMachine() {
		return imageMachine;
	}
	public void setImageMachine(String imageMachine) {
		this.imageMachine = imageMachine;
	}
	public String getNameMachine() {
		return nameMachine;
	}
	public void setNameMachine(String nameMachine) {
		this.nameMachine = nameMachine;
	}
	public Double getPriceMachine() {
		return priceMachine;
	}
	public void setPriceMachine(Double priceMachine) {
		this.priceMachine = priceMachine;
	}
	public Double getDiscountMachine() {
		return discountMachine;
	}
	public void setDiscountMachine(Double discountMachine) {
		this.discountMachine = discountMachine;
	}
	public String getDescriptionMachine() {
		return descriptionMachine;
	}
	public void setDescriptionMachine(String descriptionMachine) {
		this.descriptionMachine = descriptionMachine;
	}
	public String getAvailabilityMachine() {
		return availabilityMachine;
	}
	public void setAvailabilityMachine(String availabilityMachine) {
		this.availabilityMachine = availabilityMachine;
	}

}

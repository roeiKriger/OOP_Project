package Model;

import java.io.Serializable;

import Exceptions.NegativeNumberException;
import Utils.SnackType;

// extension class of Snack
public class Food extends Snack implements Serializable {
	
	private boolean plate;
	private boolean spaciy; 
	private boolean glutenFree; 

	public Food(SnackType type, String snackName, SnackBar bar, boolean isFattening, double price, boolean plate,
			boolean spaciy,boolean glutenFree) throws NegativeNumberException {
		super(type, snackName, bar, isFattening, price);
		this.plate = plate;
		this.spaciy = spaciy;
		this.glutenFree= glutenFree;
	}
	
	public boolean isPlate() {
		return plate;
	}

	public boolean isSpaciy() {
		return spaciy;
	}

	public void setPlate(boolean plate) {
		this.plate = plate;
	}
	
	public void setSpaciy(boolean spaciy) {
		this.spaciy = spaciy;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", plate? " + plate + ", spicy? " + spaciy;
	}
	public boolean isGlutenFree() {
		return glutenFree;
	}
	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

}

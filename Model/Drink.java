package Model;

import java.io.Serializable;

import Exceptions.NegativeNumberException;
import Utils.SnackType;

// extension of Snack class
public class Drink extends Snack implements Serializable
{
	
	private boolean sprinkel;
	private boolean  straw;
	private boolean iceCube;
	
	public Drink(SnackType type, String snackName, SnackBar bar, boolean isFattening, double price, boolean sprinkel,
			boolean straw, boolean iceCube) throws NegativeNumberException {
		super(type, snackName, bar, isFattening, price);
		this.sprinkel = sprinkel;
		this.straw = straw;
		this.iceCube = iceCube;
	}

	public boolean isSprinkel() {
		return sprinkel;
	}

	public boolean isStraw() {
		return straw;
	}

	public boolean isIceCube() {
		return iceCube;
	}

	public void setSprinkel(boolean sprinkel) {
		this.sprinkel = sprinkel;
	}

	public void setStraw(boolean straw) {
		this.straw = straw;
	}

	public void setIceCube(boolean iceCube) {
		this.iceCube = iceCube;
	}

	@Override
	public String toString() {
		return super.toString()+ ", sprinkel? " + sprinkel + ", straw? " + straw + ", ice? " + iceCube;
	}
	
}

package bobo;

import java.util.Random;

public class DeBean {

	private int value;

	public DeBean() {


	}


	public int getvalue() {
		return value;

	}
	public void setvalue(int value) {
		this.value = value;

	}

	public void lancer (){

		value = 0;
		value = new Random().nextInt(6)+1;

	}
}

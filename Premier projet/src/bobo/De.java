package bobo;

import java.util.Random;

public class De {


	public De(int value) {


		this.value = value;
	}

	protected int value;
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







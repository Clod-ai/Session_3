package pkg;

import java.util.HashMap;
import java.util.Map;

public class Cuenta {
	
	private double saldo;
	
	Map<String, Integer> movimientos = new HashMap<String, Integer>();

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Ingresar(int i, String s) {
		this.setSaldo(this.getSaldo()+i);
		movimientos.put(s,i);
		
	}

	public void Retirar(int i, String s) {
		this.setSaldo(this.getSaldo()-i);
		movimientos.put(s,i*-1);
		
	}
	
	public static void Movimiento() {
		for (String key : movimientos.keySet()){
			 System.out.println(key + "=> " + movimientos.get(key).toString());
		}
		//se muestran todos los movimientos segun quien lo hizo gracias a la Key
	}

}

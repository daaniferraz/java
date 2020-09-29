package util;

public class calculadoraCotacao {
	
	public static final double IOF=0.06;
	
	public static double calculo(double cot,double quant) {
		 
		 //return (quant*cot)+(quant*cot*6/100);
		return quant*cot*(1.0+IOF);
		
	}
	

}

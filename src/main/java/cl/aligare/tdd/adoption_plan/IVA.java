package cl.aligare.tdd.adoption_plan;

public class IVA {
	public int getTax(int neto) {
		return (int)Math.round(neto*0.19);
	}
	
	public int getAmountWithTax(int neto) {
		return (int)Math.round(neto*1.19);
	}
	
	public int getAmountWithoutTax(int total) {
		return (int)Math.round(total/1.19);
	}
}

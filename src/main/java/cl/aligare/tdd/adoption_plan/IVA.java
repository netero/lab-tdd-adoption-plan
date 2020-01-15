package cl.aligare.tdd.adoption_plan;

public class IVA {
	public int getTax(int neto) {
		return (int)Math.round(neto*0.19);
	}
}

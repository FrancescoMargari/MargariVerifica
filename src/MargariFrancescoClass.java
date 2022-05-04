/**
 * <h1><U>Calcolo sommatoria</U></h1> 
 * <i>ditta meucci</i>
 * <p><b>Margari Francesco</b></p>
 * <u>4cI</u>
 * <i>04/05/2022</i>
 * 
 * Funzioni:
 * <li>calcola sommatoria
 * 
 * 
 * @author francesco margari
 * @version 1.0
 * 
 */
public class MargariFrancescoClass {
  
	/**
	 * @param s numero intero
	 * @param f numero intero 
	 */
	private int s,f;

	/**
	 * costruttore
	 * @param s numero intero
	 * @param f numero intero
	 */
	public MargariFrancescoClass(int s, int f) {
		this.s = s;
		this.f = f;
	}
	
	/**
	 * 
	 * @param s
	 * @param f
	 * @return sommatoria intero
	 */
	public int margariMet(int s,int f) { //r deve essere diverso da 0
		int r=2;
		for(int i=1;i<f;i++) {
			r=r*i;
		}
		return r;
	}
	
	
	
	public static void main(String[] args) {
		
		MargariFrancescoClass f=new MargariFrancescoClass(4,3);
		
		System.out.println(f.margariMet(4,3));
		System.out.println(f.margariMet(3,3));
		
	}

}

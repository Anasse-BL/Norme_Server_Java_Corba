package servant;

import corbaNorme.VecteurInterfacePOA;

public class NormeServiceImp extends VecteurInterfacePOA {

	@Override
	public double norme(double a, double b, double c) {
		// TODO Auto-generated method stub
		double D;
		double N;		
		D=Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c,2);
		N=Math.sqrt(D);	
		return N;
	}

}

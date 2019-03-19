package houseConcost;

public class houseConcost {
	public static double houseCost(int materialStandard,double area) {
		double cost;
		if(materialStandard== 1)      //Standard Material
		{
			cost=1200*area;
		}
		else if(materialStandard== 2) //above standard Material
		{
			cost=1500*area;
		}
		else if(materialStandard== 3) //high standard material
		{
			cost=1800*area;
		}
		else                          //high standard+automated
		{
			cost=2500*area;
		}
		return cost;
	}

}


public class RewardValue {
	double cash;
	
	public RewardValue(double cashValue){
		this.cash=cashValue;

	}
	public RewardValue(){
		

	}
	public double getCashValue() {
		return cash;
	}
	public double getMilesValue() {
		return cash*0.0035;
	}
	
}
	

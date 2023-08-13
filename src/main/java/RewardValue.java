
public class RewardValue {
	double cash;
	int miles;
	
	public RewardValue(double cashValue){
		this.cash=cashValue;

	}
	public RewardValue(int milesValue){
		this.miles=milesValue;

	}
	
	public double getCashValue() {
		return cash;
	}
	public int getMilesValue() {
		return (int) (cash/0.0035);
	}
	
}
	


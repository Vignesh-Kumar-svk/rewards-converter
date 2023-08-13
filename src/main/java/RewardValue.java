
public class RewardValue {
	double cash;
	int miles;
	
	public RewardValue(double cashValue){
		this.cash=cashValue;

	}
	public RewardValue(int milesValue){
		this.cash=convertToCash(milesValue);

	}
	
	private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }
	
	private static double convertToCash(int milesValue) {
	        return milesValue * 0.0035;
	    }
	public double getCashValue() {
		return cash;
	}
	public int getMilesValue() {
		return convertToMiles(cash);
	}
	
		
}
	


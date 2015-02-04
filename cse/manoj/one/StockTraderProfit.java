package cse.manoj.one;

public class StockTraderProfit {

	public static void main(String[] args) {

		int[] trades = {2,4,5,-2,4,-4,3};//{1,2,3,4,-2,-3,1};
		int noOfTrades = 0;

		int maxProfit = tradeMax(trades, noOfTrades);
		System.out.println(maxProfit);
	}

	private static int tradeMax(int[] trades, int noOfTrades) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		int currentProfit = 0;
		for (int i = 0; i < trades.length; i++) {
			currentProfit = currentProfit + trades[i];
			if (currentProfit <= 0) {
				currentProfit = 0;
			}
			if (currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
		}

		return maxProfit;

	}
}

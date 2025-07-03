public class Buychoco {
    public int buyChoco(int[] prices, int money) {
        int min1 = 101, min2 = 101;
        for(int i=0; i<prices.length; i++) {
            if(min1 > prices[i]) {
                min2 = min1;
                min1 = prices[i];
            }
            else if(min2 > prices[i])
            min2 = prices[i];
        }
        if(money - (min1 + min2) >= 0) return money - (min1 + min2);
        else return money;
    } 

    public static void main(String[] args) {
        Buychoco buychoco = new Buychoco();
        int[] prices = {1, 2, 3, 4, 5};
        int money = 10;
        int remainingMoney = buychoco.buyChoco(prices, money);
        System.out.println("Remaining money after buying chocolates: " + remainingMoney);
    }
}

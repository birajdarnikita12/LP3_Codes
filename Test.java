import java.util.*;

class Item{
    double profit;
    double weight;

    Item(double profit, double weight){
        this.profit = profit;
        this.weight = weight;
    }
}

class Test {
  public static void main(String[] args) {
    double  w = 50;
    Item []arr= {new Item(60, 10), new Item(100, 20), new Item(120, 30)};
	double maxProfit = knapSack(arr, w);
	System.out.println(maxProfit);
  }
  public static double knapSack(Item[]arr, double w){
	Arrays.sort(arr,(a,b)->Double.compare(b.profit/b.weight, a.profit/a.weight));
	double finalProfit = 0.0;
	for(Item item: arr){
		if(item.weight<=w){
			w = w - item.weight;
			finalProfit = finalProfit + item.profit;
		}
		else{
			finalProfit = finalProfit + (w/item.weight)*item.profit;
		}
	}
	return finalProfit;
  }
    
}

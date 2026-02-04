package Day21_Greedy_DP_Recursion_Comparator;

import java.util.*;

class Item {
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapSack {

    public static double fractionalKnapsack(int W, int[] val, int[] wt) {
        int n = val.length;

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a, b) ->
                Double.compare(
                        (double) b.value / b.weight,
                        (double) a.value / a.weight
                )
        );

        double totalProfit = 0.0;

        for (Item item : items) {
            if (item.weight <= W) {
                totalProfit += item.value;
                W -= item.weight;
            } else {
                totalProfit += ((double) item.value / item.weight) * W;
                break;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int[] val = {25, 24, 15};
        int[] wt = {18, 15, 10};
        int W = 30;

        System.out.println(fractionalKnapsack(W, val, wt));
    }
}

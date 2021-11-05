package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Double> stocks = new ArrayList<>();

    public List<Double> getStocks() {
        return stocks;
    }

    public Stock(List<Double> stocks) {
        this.stocks = stocks;
    }

    public double selectMax() {
        double biggest = getStocks().get(getStocks().indexOf(selectMin()));
        for (int i = getStocks().indexOf(selectMin()); i < getStocks().size(); i++) {
            if (biggest < getStocks().get(i)) {
                biggest = getStocks().get(i);
            }
        }
        return biggest;
    }

    public double selectMin() {
        double smallest = getStocks().get(0);
        for (int i = 0; i < getStocks().size(); i++) {

            if (smallest > getStocks().get(i)) {
                smallest = getStocks().get(i);
            }
        }
        return smallest;
    }

    public double maxProfit() {
        double profit = selectMax() - selectMin();
        return profit;
    }

}

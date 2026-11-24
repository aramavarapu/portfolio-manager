package com.pluralsight.portfoliomanager.model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void add(Valuable valuable) {
        valuables.add(valuable);
    }

    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Valuable v : valuables) {
            total = total.add(v.getValue());
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (valuables.isEmpty()) {
            return null;
        }
        Valuable best = valuables.get(0);
        for (Valuable v : valuables) {
            if (v.getValue().compareTo(best.getValue()) > 0) {
                best = v;
            }
        }
        return best;
    }

    public Valuable getLeastValuable() {
        if (valuables.isEmpty()) {
            return null;
        }
        Valuable worst = valuables.get(0);
        for (Valuable v : valuables) {
            if (v.getValue().compareTo(worst.getValue()) < 0) {
                worst = v;
            }
        }
        return worst;
    }
}

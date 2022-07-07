package models;
import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {
    private String name;
    private int quantity;
    private double price;
    private final double taxRate = 0.05;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double income() {
        return quantity * price;
    }

    @Override
    public double incomeTaxCalculate() {
        return income() * taxRate;
    }

    @Override
    public double netIncome(double incomeTax) {
        return income() - incomeTaxCalculate();
    }
}

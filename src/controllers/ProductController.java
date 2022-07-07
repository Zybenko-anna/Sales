package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {
    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        double income = model.income();
        double incomeTax = model.incomeTaxCalculate();
        double netIncome = model.netIncome(incomeTax);

        String output = "Наименование товара:" + name + "\n"
                + "Общий доход (грн.): " + Rounder.round(income) + "\n"
                + "Сумма налога (грн.): " + Rounder.round(incomeTax) + "\n"
                + "Чистый доход (грн.): " + Rounder.round(netIncome);

        view.getOutput(output);
    }
}

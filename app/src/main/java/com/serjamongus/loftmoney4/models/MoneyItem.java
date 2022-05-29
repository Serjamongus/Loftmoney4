package com.serjamongus.loftmoney4.models;

public class MoneyItem {
    private String title;
    private int price;

    public MoneyItem(final String title, final int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

}
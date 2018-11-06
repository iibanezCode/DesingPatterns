package com.company.Beverages;

import com.company.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blends Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

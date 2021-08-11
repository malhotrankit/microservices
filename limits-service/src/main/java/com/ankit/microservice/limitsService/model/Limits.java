package com.ankit.microservice.limitsService.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

public class Limits
{
    private int minimum;
    private int maximum;

    public Limits(){
        super();
    }

    public Limits(int minimum, int maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}

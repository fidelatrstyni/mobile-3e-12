package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }
    public void setMeter(double m) {
        meter = m;
    }
    public void setInch(double m) {
        meter = m / 39.3701;
    }
    public void setMile(double m) {
        meter = m / 0.000621371;
    }
    public void setFoot(double m) {
        meter = m / 3.28084;
    }
    public double getMeter() {
        return meter;
    }
    public double getInch() {
        return meter * 39.3701;
    }
    public double getMile() {
        return meter * 0.000621371;
    }
    public double getFoot() {
        return meter * 3.28084;
    }
    public double convert(String oriUnit, String convUnit, double value) {
        if(convUnit.equals("Mtr")) {
            setMeter(value);
        }
        else if(oriUnit.equals("inc")) {
            setInch(value);
        }
        else if(oriUnit.equals("Mil")) {
            setMile(value);
        }
        else {
            setFoot(value);
        }
        if(convUnit.equals("Mtr")) {
            return getMeter();
        }
        else if(convUnit.equals("Inc")) {
            return getInch();
        }
        else if(convUnit.equals("Mil")) {
            return getMile();
        }
        else {
            return getFoot();
        }
    }
}
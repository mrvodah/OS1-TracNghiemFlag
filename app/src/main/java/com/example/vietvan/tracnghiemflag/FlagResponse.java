package com.example.vietvan.tracnghiemflag;

import android.graphics.Region;

import java.util.List;

/**
 * Created by VietVan on 03/05/2018.
 */

public class FlagResponse {

    private String name, region, flag;
    private int population;
    private double area;
    private String subregion;
    private boolean is;
    private List<Region> regionalBlocs;

    public class Region{
        public String acronym;

        public String getAcronym() {
            return acronym;
        }

        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }

        @Override
        public String toString() {
            return "Region{" +
                    "acronym='" + acronym + '\'' +
                    '}';
        }
    }

    public FlagResponse(String name, String region, String flag, int population, double area) {
        this.name = name;
        this.region = region;
        this.flag = flag;
        this.population = population;
        this.area = area;
    }

    public FlagResponse(String name, String region, String flag, int population, double area, String subregion, boolean is, List<Region> regionalBlocs) {
        this.name = name;
        this.region = region;
        this.flag = flag;
        this.population = population;
        this.area = area;
        this.subregion = subregion;
        this.is = is;
        this.regionalBlocs = regionalBlocs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIs() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }

    public List<Region> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<Region> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    @Override
    public String toString() {
        return "FlagResponse{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}

package com.moodyjun.strategy;

import java.util.ArrayList;

public class Context {
    private Sorting sorting;

    public Sorting getSorting() {
        return sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void sort(){
        this.sorting.execute(new ArrayList<>());
    }
}

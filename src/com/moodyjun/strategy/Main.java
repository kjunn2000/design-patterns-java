package com.moodyjun.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setSorting(new MergeSort());
        context.sort();
        context.setSorting(new QuickSort());
        context.sort();
    }
}

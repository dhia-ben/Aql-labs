package com.example.choclatBag;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;

    }


    public int makeChocolate(int small, int big, int goal) {
        int maxBigBoxes = goal / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        goal -= (bigBoxesWeCanUse * 5);
        if(small <= goal)
            return -1;
        return goal;
    }

}

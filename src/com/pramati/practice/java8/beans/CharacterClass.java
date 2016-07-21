package com.pramati.practice.java8.beans;

import java.util.List;

/**
 * Created by satyat on 13/07/16.
 */
class CharacterClass{
    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(List<Integer> index) {
        this.index = index;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private List<Integer> index;
    private Integer count;
}

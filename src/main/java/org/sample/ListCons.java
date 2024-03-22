package org.sample;

import java.util.*;

public class ListCons {
    private List<List<Integer>> res;

    public List<List<Integer>> toList(Set<List<Integer>> nums) {
        if (res==null) res =new ArrayList<>(nums);
        return res;
    }

    public List<List<Integer>> toAbsList(Set<List<Integer>> nums) {
        return new AbstractList<>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            public int size() {
                init();
                return res.size();
            }

            private void init() {
                if (res != null) return;
                res = new ArrayList<>(nums);
            }

        };
    }
}

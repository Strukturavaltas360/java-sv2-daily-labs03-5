package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Integer> heightofChildren = new ArrayList<>();

    public void addHeight(int height) {
        heightofChildren.add(height);
    }

    public boolean isHeightsIncreasing() {
        for (int i=1; i<heightofChildren.size();i++) {
            if (heightofChildren.get(i) < heightofChildren.get(i-1)) {
                return false;
            }
        }
        return true;
    }


}

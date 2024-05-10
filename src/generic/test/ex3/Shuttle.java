package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    // 유닛 추가
    public void in (T unit) {
        this.unit = unit;
    }

    // 유닛정보
    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public T getUnit() {
        return unit;
    }
}

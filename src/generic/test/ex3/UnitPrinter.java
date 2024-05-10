package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    // 제네릭메서드
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T unit = shuttle.getUnit();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    // 와일드카드
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.getUnit();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

}

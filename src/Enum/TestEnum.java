package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        ArrayList<SV> list = new ArrayList<>();

        SV sv1 = new SV(1, "sv1", 9.5);
        SV sv2 = new SV(2, "sv2", 7.5);
        SV sv3 = new SV(3, "sv3", 6.5);
        SV sv4 = new SV(4, "sv4", 5.5);
        SV sv5 = new SV(5, "sv5", 4.5);
        SV sv6 = new SV(6, "sv6", 3.5);
        SV sv7 = new SV(7, "sv7", 2.5);
        SV sv8 = new SV(8, "sv8", 1.5);

        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);
        list.add(sv5);
        list.add(sv6);
        list.add(sv7);
        list.add(sv8);

        for(SV sv : list) {
            System.out.println(sv);
        }

    }
}

package chapter16;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain>{

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return (two.height - one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("Long-Reindg", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Marun", 14156));
        mtn.add(new Mountain("Casl", 14265));

        System.out.println("By adding : \n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("By name : \n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By height : \n" + mtn);



    }


    private class Mountain {

        String name;
        int height;

        Mountain(String n, int h){
            name = n;
            height = h;
        }

        public String toString() {
            return name + " " + height;
        }
    }
}

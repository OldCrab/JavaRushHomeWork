package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.TreeSet;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public  Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }


    public synchronized int compareTo(Beach o)
    {
        int distanceParam = (int) (distance - o.getDistance());
        int qualityParam = quality - o.getQuality();
        return 10000 * name.compareTo(o.getName()) + 100 * distanceParam + qualityParam;



    }

//    public synchronized int compareTo(Beach o) {
//        int result = name.compareTo(o.getName());
//        if(result != 0) {
//            return result;
//        }
//
//        float res = distance - o.getDistance();
//        if(res != 0) {
//            return (int)(res/Math.abs(res));
//        }
//
//        result = quality - o.getQuality();
//        if (result != 0){
//            return result/Math.abs(result);
//        }
//        return 0;
//    }



    public static void main(String[] args) {
        TreeSet<Beach> ex = new TreeSet<Beach>();
        ex.add(new Beach("Stive Global", 121.3F,15));
        ex.add(new Beach("Stive Global", 141.3F,35));
        ex.add(new Beach("Nancy Summer", 3213F, 3));
        ex.add(new Beach("Aaron Eagle", 3123F,123));
        ex.add(new Beach("Barbara Smith", 88786F,3));

        for(Beach e : ex) {
            System.out.println("Name: " + e.getName() + ", distance: " + e.getDistance()+ ", quality: " +e.getQuality());
        }
    }

}



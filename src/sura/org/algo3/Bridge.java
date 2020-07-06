package sura.org.algo3;

import java.util.*;

public class Bridge {

    public static void main(String[] args) {

        Bridge br = new Bridge();

        br.solution(2,10, new int[]{7, 4, 5, 6});

    }

    class Truck {

        int time;
        int weight;

        Truck(int time, int weight) {
            this.time = time;
            this.weight = weight;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int time = 0;

        Queue<Truck> bridge_weight = new LinkedList<>();
        Queue<Truck> trucks = new LinkedList<>();

        for(int truck : truck_weights) {
            trucks.offer(new Truck(0,truck));
        }

        assert trucks.peek() != null;
        bridge_weight.offer(new Truck(trucks.peek().time+1, trucks.peek().weight));
        trucks.poll();

        while(true) {

            time++;

            if(!bridge_weight.isEmpty() && !trucks.isEmpty()) {

                if( bridge_weight.peek().weight + trucks.peek().weight <= weight ) {

//                    bridge_weight.offer(new Truck())

                } else {

                }

            } else {

            }



        }
    }
}

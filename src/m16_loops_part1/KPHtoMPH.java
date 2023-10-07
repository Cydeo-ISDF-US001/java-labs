package m16_loops_part1;

//  Print KPH and MPH conversion table like you see below
//  (1 mile = 0.62 * km)
//  KPH	|	MPH
//  -------------
//  20	|	12.4
//  30	|	18.6
//  40	|	24.8
//  50	|	31.0
//  60	|	37.2
//  70	|	43.4
//  80	|	49.6
//  90	|	55.8
//  100	|	62.0
//  110	|	68.2
//  120	|	74.4
//  130	|	80.6
//  140	|	86.8

public class KPHtoMPH {

    public static void main(String[] args) {

        int kph = 0;
        double mph = 0.0;

        System.out.println("kph\t|\tmph");
        System.out.println("--------------");

        for(int i = 20; i <= 140; i += 10){
            kph = i;
            mph = kph * 0.62;

            System.out.println(kph + "\t|\t" + mph);
        }



    }

}

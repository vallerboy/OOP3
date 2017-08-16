package taskWater;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Water {
    private static int bigBottle = 2;
    private static int middleBottle = 1;
    private static double smallBottle = 0.5;

    private int countBig;
    private int countMiddle;
    private int countSmall;

    public Water() {
        countBig = 0;
        countMiddle = 0;
        countSmall = 0;
    }


    public void addSmall(int i){
        countSmall += i;
    }


}

package FifteenFebruaryJava;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isPlayingCat(false,35));
    }
    public static boolean isPlayingCat(boolean summer,int temprature){
        if (summer){
            if (temprature >=25 && temprature <=35){
                return true;
            }else {
                return false;
            }
            }else {
            if (temprature>=25 && temprature<=35){
                return true;
            }
        }
        return false;
    }

}

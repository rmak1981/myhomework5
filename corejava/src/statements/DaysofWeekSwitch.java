package statements;

public class DaysofWeekSwitch {
    public static void main(String[] args) {
        int day = 3 ;
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednsday");
                break;
            default:
                System.out.println("Input is not valid");
        }

    }
}

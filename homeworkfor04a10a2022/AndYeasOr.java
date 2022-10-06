package homeworkfor04a10a2022;

public class AndYeasOr {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        boolean canBuy = isEdekaOpen || isReweOpen;
        String str = "Я могу купить еду " + canBuy;
        System.out.println(str);
    }
}

public class Switch2 {
    public static void main(String[] args) {
        int day = 4;
        String dayString = switch (day) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalide";
        };
        System.out.println("Jour : " + dayString);
    }
}
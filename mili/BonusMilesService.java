public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;
        if (price >= 20) {
            return price / 20;

        int bonus = 20;
        int miles = price / bonus;
        if (price >= bonus) {
        } else {
            miles = 0;
        }
        return miles;
    }
}

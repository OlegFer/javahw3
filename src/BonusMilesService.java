public class BonusMilesService {
    public int calculate (int cost) {

        int bonus;
        int bonusPrice = 20; // за каждые 20 рублей начисляется одна миля
        bonus = cost / bonusPrice; // расчет бонусных миль

        return bonus;
    }
}

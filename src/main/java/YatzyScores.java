import java.util.List;
import java.util.Optional;

public class YatzyScores {

    public static int chance(DiceRoll roll) {
        return roll.sum();
    }

    public static int yatzy(DiceRoll roll) {
        if (roll.isYatzy()) {
            return 50;
        }
        return 0;
    }

    public static int ones(DiceRoll roll) {
        return roll.countDice(1);
    }

    public static int twos(DiceRoll roll) {
        return roll.countDice(2);
    }

    public static int threes(DiceRoll roll) {
        return roll.countDice(3);
    }

    public static int fours(DiceRoll roll) {
        return roll.countDice(4);
    }

    public static int fives(DiceRoll roll) {
        return roll.countDice(5);
    }

    public static int sixes(DiceRoll roll) {
        return roll.countDice(6);
    }

    public static int pair(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(2);
        if (pairs.isEmpty()) {
            return 0;
        } else {
            return pairs.get(0) * 2;
        }
    }

    public static int twoPairs(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(2);
        if (pairs.size() >= 2) {
            return pairs.get(0) * 2 + pairs.get(1) * 2;
        } else {
            return 0;
        }
    }

    public static int threeOfAKind(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(3);
        if (!pairs.isEmpty()) {
            return pairs.get(0) * 3;
        }
        return 0;
    }

    public static int fourOfAKind(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(4);
        if (!pairs.isEmpty()) {
            return pairs.get(0) * 4;
        }
        return 0;
    }

    public static int smallStraight(DiceRoll roll) {
        if (roll.sort().equals(List.of(1, 2, 3, 4, 5))) {
            return 15;
        }
        return 0;
    }

    public static int largeStraight(DiceRoll roll) {
        if (roll.sort().equals(List.of(2, 3, 4, 5, 6))) {
            return 20;
        }
        return 0;
    }

    public static int fullHouse(DiceRoll roll) {
        Optional<Integer> twoOfKindDice = roll.findDiceOccurrences(2);
        Optional<Integer> threeOfKindDice = roll.findDiceOccurrences(3);
        if (twoOfKindDice.isPresent() && threeOfKindDice.isPresent() &&
                !twoOfKindDice.get().equals(threeOfKindDice.get())) {
            return threeOfKindDice.get() * 3 + twoOfKindDice.get() * 2;
        }
        return 0;
    }
}

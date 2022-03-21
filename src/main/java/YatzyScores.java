import java.util.List;
import java.util.Optional;

public class YatzyScores {

    int chance(DiceRoll roll) {
        return roll.sum();
    }

    int yatzy(DiceRoll roll) {
        if (roll.isYatzy()) {
            return 50;
        }
        return 0;
    }

    int ones(DiceRoll roll) {
        return roll.countDice(1);
    }

    int twos(DiceRoll roll) {
        return roll.countDice(2);
    }

    int threes(DiceRoll roll) {
        return roll.countDice(3);
    }

    int fours(DiceRoll roll) {
        return roll.countDice(4);
    }

    int fives(DiceRoll roll) {
        return roll.countDice(5);
    }

    int sixes(DiceRoll roll) {
        return roll.countDice(6);
    }

    int pair(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(2);
        if (pairs.isEmpty()) {
            return 0;
        } else {
            return pairs.get(0) * 2;
        }
    }

    int twoPairs(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(2);
        if (pairs.size() >= 2) {
            return pairs.get(0) * 2 + pairs.get(1) * 2;
        } else {
            return 0;
        }
    }

    int threeOfAKind(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(3);
        if (!pairs.isEmpty()) {
            return pairs.get(0) * 3;
        }
        return 0;
    }

    int fourOfAKind(DiceRoll roll) {
        List<Integer> pairs = roll.filterNumberOfDiceGreaterThan(4);
        if (!pairs.isEmpty()) {
            return pairs.get(0) * 4;
        }
        return 0;
    }

    int smallStraight(DiceRoll roll) {
        if (roll.sort().equals(List.of(1, 2, 3, 4, 5))) {
            return 15;
        }
        return 0;
    }

    int largeStraight(DiceRoll roll) {
        if (roll.sort().equals(List.of(2, 3, 4, 5, 6))) {
            return 20;
        }
        return 0;
    }

    int fullHouse(DiceRoll roll) {
        Optional<Integer> twoOfKindDice = roll.findDiceOccurrences(2);
        Optional<Integer> threeOfKindDice = roll.findDiceOccurrences(3);
        if (twoOfKindDice.isPresent() && threeOfKindDice.isPresent() &&
                !twoOfKindDice.get().equals(threeOfKindDice.get())) {
            return threeOfKindDice.get() * 3 + twoOfKindDice.get() * 2;
        }
        return 0;
    }
}

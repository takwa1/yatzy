import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiceRoll {
    private final List<Integer> dice;

    public DiceRoll(int d1, int d2, int d3, int d4, int d5) {
        this.dice = Arrays.asList(d1, d2, d3, d4, d5);
    }

    /**
     * compute occurrences of each element in the dice.
     * @return map that key is the dice and value is the number of occurrence.
     */
    public Map<Integer, Integer> countOccurrences() {
        return dice.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }

    /**
     * Compute the sum of the dice based on the parameter
     * @param d int value
     * @return integer value.
     */
    public int countDice(int d) {
        return dice.stream()
                .filter(value -> value == d)
                .reduce(0, Integer::sum);
    }

    /**
     *
     * @return sorted list.
     */
    public List<Integer> sort() {
        return dice.stream()
                .sorted().toList();
    }

    /**
     * compute the sum of elements.
     * @return the sum of elements.
     */
    public int sum() {
        return dice.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     *
     * @return true if dice is Yatzy (all items are equals).
     */
    public boolean isYatzy() {
        return dice.stream().allMatch(dice.get(0)::equals);
    }

    /**
     * filter the list of occurrences that is greater than param n.
     * @param n int value.
     * @return list of integer
     */
    public List<Integer> filterNumberOfDiceGreaterThan(int n) {
        return countOccurrences()
                .entrySet().stream()
                .filter(m -> m.getValue() >= n)
                .map(Map.Entry::getKey)
                .sorted(Collections.reverseOrder())
                .toList();
    }

    /**
     * find the element if repeat n times.
     * @param n parameter (repeat times).
     * @return optional of repeated element.
     */
    public Optional<Integer> findDiceOccurrences(int n) {
        return countOccurrences().entrySet().stream()
                .filter(m -> m.getValue() == n)
                .map(Map.Entry::getKey).findFirst();
    }

}

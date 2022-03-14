import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyScoreTest {

    @Test
    public void chance() {
        assertEquals(15, YatzyScores.chance(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(16, YatzyScores.chance(new DiceRoll(3, 3, 4, 5, 1)));
        assertEquals(14, YatzyScores.chance(new DiceRoll(1, 1, 3, 3, 6)));
        assertEquals(21, YatzyScores.chance(new DiceRoll(4, 5, 5, 6, 1)));
    }

    @Test
    public void yatzy() {
        assertEquals(50, YatzyScores.yatzy(new DiceRoll(4, 4, 4, 4, 4)));
        assertEquals(50, YatzyScores.yatzy(new DiceRoll(6, 6, 6, 6, 6)));
        assertEquals(0, YatzyScores.yatzy(new DiceRoll(6, 6, 6, 6, 3)));
        assertEquals(50, YatzyScores.yatzy(new DiceRoll(1, 1, 1, 1, 1)));
        assertEquals(0, YatzyScores.yatzy(new DiceRoll(1, 1, 1, 2, 1)));
    }

    @Test
    public void ones() {
        assertEquals(1, YatzyScores.ones(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(2, YatzyScores.ones(new DiceRoll(1, 2, 1, 4, 5)));
        assertEquals(0, YatzyScores.ones(new DiceRoll(6, 2, 2, 4, 5)));
        assertEquals(4, YatzyScores.ones(new DiceRoll(1, 2, 1, 1, 1)));
        assertEquals(0, YatzyScores.ones(new DiceRoll(3, 3, 3, 4, 5)));
    }

    @Test
    public void twos() {
        assertEquals(4, YatzyScores.twos(new DiceRoll(1, 2, 3, 2, 6)));
        assertEquals(10, YatzyScores.twos(new DiceRoll(2, 2, 2, 2, 2)));
        assertEquals(4, YatzyScores.twos(new DiceRoll(2, 3, 2, 5, 1)));
    }

    @Test
    public void threes() {
        assertEquals(6, YatzyScores.threes(new DiceRoll(1, 2, 3, 2, 3)));
        assertEquals(12, YatzyScores.threes(new DiceRoll(2, 3, 3, 3, 3)));
    }

    @Test
    public void fours() {
        assertEquals(12, YatzyScores.fours(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(8, YatzyScores.fours(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(4, YatzyScores.fours(new DiceRoll(4, 5, 5, 5, 5)));
        assertEquals(8, YatzyScores.fours(new DiceRoll(1, 1, 2, 4, 4)));
    }

    @Test
    public void fives() {
        assertEquals(10, YatzyScores.fives(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(15, YatzyScores.fives(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(20, YatzyScores.fives(new DiceRoll(4, 5, 5, 5, 5)));
    }

    @Test
    public void sixes() {
        assertEquals(0, YatzyScores.sixes(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(6, YatzyScores.sixes(new DiceRoll(4, 4, 6, 5, 5)));
        assertEquals(18, YatzyScores.sixes(new DiceRoll(6, 5, 6, 6, 5)));
    }

    @Test
    public void pair() {
        assertEquals(6, YatzyScores.pair(new DiceRoll(3, 4, 3, 5, 6)));
        assertEquals(10, YatzyScores.pair(new DiceRoll(5, 3, 3, 3, 5)));
        assertEquals(12, YatzyScores.pair(new DiceRoll(5, 3, 6, 6, 5)));
        assertEquals(0, YatzyScores.pair(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(8, YatzyScores.pair(new DiceRoll(3, 3, 3, 4, 4)));
        assertEquals(12, YatzyScores.pair(new DiceRoll(1, 1, 6, 2, 6)));
        assertEquals(6, YatzyScores.pair(new DiceRoll(3, 3, 3, 4, 1)));
        assertEquals(6, YatzyScores.pair(new DiceRoll(3, 3, 3, 3, 1)));
        assertEquals(2, YatzyScores.pair(new DiceRoll(1, 1, 2, 3, 4)));
    }

    @Test
    public void twoPairs() {
        assertEquals(16, YatzyScores.twoPairs(new DiceRoll(3, 3, 5, 4, 5)));
        assertEquals(16, YatzyScores.twoPairs(new DiceRoll(3, 3, 5, 5, 5)));
        assertEquals(8, YatzyScores.twoPairs(new DiceRoll(1, 1, 2, 3, 3)));
        assertEquals(0, YatzyScores.twoPairs(new DiceRoll(1, 1, 2, 3, 4)));
        assertEquals(6, YatzyScores.twoPairs(new DiceRoll(1, 1, 2, 2, 2)));
        assertEquals(0, YatzyScores.twoPairs(new DiceRoll(3, 3, 3, 3, 1)));
        assertEquals(0, YatzyScores.twoPairs(new DiceRoll(4, 4, 4, 4, 1)));
    }

    @Test
    public void threeOfAKind() {
        assertEquals(15, YatzyScores.threeOfAKind(new DiceRoll(5, 3, 5, 4, 5)));
        assertEquals(9, YatzyScores.threeOfAKind(new DiceRoll(3, 3, 3, 4, 5)));
        assertEquals(9, YatzyScores.threeOfAKind(new DiceRoll(3, 3, 3, 3, 5)));
        assertEquals(9, YatzyScores.threeOfAKind(new DiceRoll(3, 3, 3, 3, 3)));
        assertEquals(0, YatzyScores.threeOfAKind(new DiceRoll(3, 3, 4, 5, 6)));
    }

    @Test
    public void fourOfAKind() {
        assertEquals(12, YatzyScores.fourOfAKind(new DiceRoll(3, 3, 3, 3, 5)));
        assertEquals(20, YatzyScores.fourOfAKind(new DiceRoll(5, 5, 5, 4, 5)));
        assertEquals(8, YatzyScores.fourOfAKind(new DiceRoll(2, 2, 2, 2, 5)));
        assertEquals(0, YatzyScores.fourOfAKind(new DiceRoll(2, 2, 2, 5, 5)));
        assertEquals(8, YatzyScores.fourOfAKind(new DiceRoll(2, 2, 2, 2, 2)));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, YatzyScores.smallStraight(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(15, YatzyScores.smallStraight(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(0, YatzyScores.smallStraight(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, YatzyScores.largeStraight(new DiceRoll(6, 2, 3, 4, 5)));
        assertEquals(20, YatzyScores.largeStraight(new DiceRoll(2, 3, 4, 5, 6)));
        assertEquals(0, YatzyScores.largeStraight(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, YatzyScores.fullHouse(new DiceRoll(6, 2, 2, 2, 6)));
        assertEquals(0, YatzyScores.fullHouse(new DiceRoll(2, 3, 4, 5, 6)));
        assertEquals(8, YatzyScores.fullHouse(new DiceRoll(1, 1, 2, 2, 2)));
        assertEquals(0, YatzyScores.fullHouse(new DiceRoll(2, 2, 3, 3, 4)));
        assertEquals(0, YatzyScores.fullHouse(new DiceRoll(4, 4, 4, 4, 4)));
    }
}
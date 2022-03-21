import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyScoreTest {

    @Test
    public void chance() {
        assertEquals(15, YatzyCategory.Chance.apply(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(16, YatzyCategory.Chance.apply(new DiceRoll(3, 3, 4, 5, 1)));
        assertEquals(14, YatzyCategory.Chance.apply(new DiceRoll(1, 1, 3, 3, 6)));
        assertEquals(21, YatzyCategory.Chance.apply(new DiceRoll(4, 5, 5, 6, 1)));
    }

    @Test
    public void yatzy() {
        assertEquals(50, YatzyCategory.Yatzy.apply(new DiceRoll(4, 4, 4, 4, 4)));
        assertEquals(50, YatzyCategory.Yatzy.apply(new DiceRoll(6, 6, 6, 6, 6)));
        assertEquals(0, YatzyCategory.Yatzy.apply(new DiceRoll(6, 6, 6, 6, 3)));
        assertEquals(50, YatzyCategory.Yatzy.apply(new DiceRoll(1, 1, 1, 1, 1)));
        assertEquals(0, YatzyCategory.Yatzy.apply(new DiceRoll(1, 1, 1, 2, 1)));
    }

    @Test
    public void ones() {
        assertEquals(1, YatzyCategory.Ones.apply(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(2, YatzyCategory.Ones.apply(new DiceRoll(1, 2, 1, 4, 5)));
        assertEquals(0, YatzyCategory.Ones.apply(new DiceRoll(6, 2, 2, 4, 5)));
        assertEquals(4, YatzyCategory.Ones.apply(new DiceRoll(1, 2, 1, 1, 1)));
        assertEquals(0, YatzyCategory.Ones.apply(new DiceRoll(3, 3, 3, 4, 5)));
    }

    @Test
    public void twos() {
        assertEquals(4, YatzyCategory.Twos.apply(new DiceRoll(1, 2, 3, 2, 6)));
        assertEquals(10, YatzyCategory.Twos.apply(new DiceRoll(2, 2, 2, 2, 2)));
        assertEquals(4, YatzyCategory.Twos.apply(new DiceRoll(2, 3, 2, 5, 1)));
    }

    @Test
    public void threes() {
        assertEquals(6, YatzyCategory.Threes.apply(new DiceRoll(1, 2, 3, 2, 3)));
        assertEquals(12, YatzyCategory.Threes.apply(new DiceRoll(2, 3, 3, 3, 3)));
    }

    @Test
    public void fours() {
        assertEquals(12, YatzyCategory.Fours.apply(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(8, YatzyCategory.Fours.apply(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(4, YatzyCategory.Fours.apply(new DiceRoll(4, 5, 5, 5, 5)));
        assertEquals(8, YatzyCategory.Fours.apply(new DiceRoll(1, 1, 2, 4, 4)));
    }

    @Test
    public void fives() {
        assertEquals(10, YatzyCategory.Fives.apply(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(15, YatzyCategory.Fives.apply(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(20, YatzyCategory.Fives.apply(new DiceRoll(4, 5, 5, 5, 5)));
    }

    @Test
    public void sixes() {
        assertEquals(0, YatzyCategory.Sixes.apply(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(6, YatzyCategory.Sixes.apply(new DiceRoll(4, 4, 6, 5, 5)));
        assertEquals(18, YatzyCategory.Sixes.apply(new DiceRoll(6, 5, 6, 6, 5)));
    }

    @Test
    public void pair() {
        assertEquals(6, YatzyCategory.Pair.apply(new DiceRoll(3, 4, 3, 5, 6)));
        assertEquals(10, YatzyCategory.Pair.apply(new DiceRoll(5, 3, 3, 3, 5)));
        assertEquals(12, YatzyCategory.Pair.apply(new DiceRoll(5, 3, 6, 6, 5)));
        assertEquals(0, YatzyCategory.Pair.apply(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(8, YatzyCategory.Pair.apply(new DiceRoll(3, 3, 3, 4, 4)));
        assertEquals(12, YatzyCategory.Pair.apply(new DiceRoll(1, 1, 6, 2, 6)));
        assertEquals(6, YatzyCategory.Pair.apply(new DiceRoll(3, 3, 3, 4, 1)));
        assertEquals(6, YatzyCategory.Pair.apply(new DiceRoll(3, 3, 3, 3, 1)));
        assertEquals(2, YatzyCategory.Pair.apply(new DiceRoll(1, 1, 2, 3, 4)));
    }

    @Test
    public void twoPairs() {
        assertEquals(16, YatzyCategory.TwoPairs.apply(new DiceRoll(3, 3, 5, 4, 5)));
        assertEquals(16, YatzyCategory.TwoPairs.apply(new DiceRoll(3, 3, 5, 5, 5)));
        assertEquals(8, YatzyCategory.TwoPairs.apply(new DiceRoll(1, 1, 2, 3, 3)));
        assertEquals(0, YatzyCategory.TwoPairs.apply(new DiceRoll(1, 1, 2, 3, 4)));
        assertEquals(6, YatzyCategory.TwoPairs.apply(new DiceRoll(1, 1, 2, 2, 2)));
        assertEquals(0, YatzyCategory.TwoPairs.apply(new DiceRoll(3, 3, 3, 3, 1)));
        assertEquals(0, YatzyCategory.TwoPairs.apply(new DiceRoll(4, 4, 4, 4, 1)));
    }

    @Test
    public void threeOfAKind() {
        assertEquals(15, YatzyCategory.ThreeOfAKind.apply(new DiceRoll(5, 3, 5, 4, 5)));
        assertEquals(9, YatzyCategory.ThreeOfAKind.apply(new DiceRoll(3, 3, 3, 4, 5)));
        assertEquals(9, YatzyCategory.ThreeOfAKind.apply(new DiceRoll(3, 3, 3, 3, 5)));
        assertEquals(9, YatzyCategory.ThreeOfAKind.apply(new DiceRoll(3, 3, 3, 3, 3)));
        assertEquals(0, YatzyCategory.ThreeOfAKind.apply(new DiceRoll(3, 3, 4, 5, 6)));
    }

    @Test
    public void fourOfAKind() {
        assertEquals(12, YatzyCategory.FourOfAKind.apply(new DiceRoll(3, 3, 3, 3, 5)));
        assertEquals(20, YatzyCategory.FourOfAKind.apply(new DiceRoll(5, 5, 5, 4, 5)));
        assertEquals(8, YatzyCategory.FourOfAKind.apply(new DiceRoll(2, 2, 2, 2, 5)));
        assertEquals(0, YatzyCategory.FourOfAKind.apply(new DiceRoll(2, 2, 2, 5, 5)));
        assertEquals(8, YatzyCategory.FourOfAKind.apply(new DiceRoll(2, 2, 2, 2, 2)));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, YatzyCategory.SmallStraight.apply(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(15, YatzyCategory.SmallStraight.apply(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(0, YatzyCategory.SmallStraight.apply(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, YatzyCategory.LargeStraight.apply(new DiceRoll(6, 2, 3, 4, 5)));
        assertEquals(20, YatzyCategory.LargeStraight.apply(new DiceRoll(2, 3, 4, 5, 6)));
        assertEquals(0, YatzyCategory.LargeStraight.apply(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, YatzyCategory.FullHouse.apply(new DiceRoll(6, 2, 2, 2, 6)));
        assertEquals(0, YatzyCategory.FullHouse.apply(new DiceRoll(2, 3, 4, 5, 6)));
        assertEquals(8, YatzyCategory.FullHouse.apply(new DiceRoll(1, 1, 2, 2, 2)));
        assertEquals(0, YatzyCategory.FullHouse.apply(new DiceRoll(2, 2, 3, 3, 4)));
        assertEquals(0, YatzyCategory.FullHouse.apply(new DiceRoll(4, 4, 4, 4, 4)));
    }
}
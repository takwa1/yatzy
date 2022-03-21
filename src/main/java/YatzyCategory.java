interface YatzyCategoryInterface {
    int apply(DiceRoll roll);
}

public enum YatzyCategory implements YatzyCategoryInterface {
    Chance {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().chance(roll);
        }
    },

    Yatzy {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().yatzy(roll);
        }
    },
    Ones {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().ones(roll);
        }
    },
    Twos {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().twos(roll);
        }
    },
    Threes {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().threes(roll);
        }
    },
    Fours {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().fours(roll);
        }
    },
    Fives {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().fives(roll);
        }
    },
    Sixes {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().sixes(roll);
        }
    },
    Pair {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().pair(roll);
        }
    },
    TwoPairs {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().twoPairs(roll);
        }
    },
    ThreeOfAKind {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().threeOfAKind(roll);
        }
    },
    FourOfAKind {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().fourOfAKind(roll);
        }
    },
    SmallStraight {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().smallStraight(roll);
        }
    },
    LargeStraight {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().largeStraight(roll);
        }
    },
    FullHouse {
        @Override
        public int apply(DiceRoll roll) {
            return new YatzyScores().fullHouse(roll);
        }
    };
}
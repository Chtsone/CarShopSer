package sequence.impl;

import sequence.Sequence;

public class CarSequence implements Sequence
    {
        private int counter;
        @Override
        public int next()
            {
                return counter++;
            }
    }

package sequence.impl;

import sequence.Sequence;

public class OrderSequence implements Sequence
    {
        private static int counter;
        @Override
        public int next()
            {
                return counter++;
            }
    }

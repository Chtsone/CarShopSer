package sequence.impl;

import sequence.Sequence;

public class UserSequence implements Sequence
    {
        private static int count;
        @Override
        public int next()
            {
                return count++;
            }
    }

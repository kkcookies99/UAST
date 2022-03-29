 class Solution {
    public int XXX(String s) {
        Automaton automaton = new Automaton();
        for (char c : s.toCharArray()) {
            automaton.give(c);
        }
        return automaton.result();
    }
}

class Automaton {
    private State now = State.START;
    private int res = 0;
    public void give(char c) {
        int digit = c - '0';
        State next = now.nextState(Input.get(c));
        switch (next) {
            case START:
            case END:
                break;
            case POSITIVE:
                if (Character.isDigit(c)) {
                    res = res * 10 + digit;
                }
                break;
            case NEGATIVE:
                if (Character.isDigit(c)) {
                    res = res * 10 - digit;
                }
                break;
            case UNKNOWN:
                if (now == State.POSITIVE) {
                    if (res > (Integer.MAX_VALUE - digit) / 10) {
                        res = Integer.MAX_VALUE;
                        next = State.P_OVERFLOW;
                    } else {
                        res = res * 10 + digit;
                        next = State.POSITIVE;
                    }
                } else {
                    if (res < (Integer.MIN_VALUE + digit) / 10) {
                        res = Integer.MIN_VALUE;
                        next = State.N_OVERFLOW;
                    } else {
                        res = res * 10 - digit;
                        next = State.NEGATIVE;
                    }
                }
                break;
        }
        now = next;
    }
    public int result() {
        return res;
    }
}




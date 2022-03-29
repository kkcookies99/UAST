class Solution {
    public int XXX(String s) {
        int sum = 0;
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current;
            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                default:
                    current = 1000;
                    break;
            }
            if (current >= previous) {
                sum += current;
            } else {
                sum -= current;
            }
            previous = current;
        }
        return sum;
    }
}


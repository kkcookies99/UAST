 class Solution {
    public int XXX(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I'){
                if (i+1 < s.length() && s.charAt(i+1) == 'V'){
                    sum += 4;
                    i++;
                    continue;
                }
                if (i+1 < s.length() && s.charAt(i+1) == 'X'){
                    sum += 9;
                    i++;
                    continue;
                }
            }

            if (s.charAt(i) == 'X'){
                if (i+1 < s.length() && s.charAt(i+1) == 'L'){
                    sum += 40;
                    i++;
                    continue;
                }
                if (i+1 < s.length() && s.charAt(i+1) == 'C'){
                    sum += 90;
                    i++;
                    continue;
                }
            }
            if (s.charAt(i) == 'C'){
                if (i+1 < s.length() && s.charAt(i+1) == 'D'){
                    sum += 400;
                    i++;
                    continue;
                }
                if (i+1 < s.length() && s.charAt(i+1) == 'M'){
                    sum += 900;
                    i++;
                    continue;
                }
            }
            switch (s.charAt(i)){
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}


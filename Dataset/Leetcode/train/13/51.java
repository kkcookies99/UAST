class Solution {
    public int XXX(String s) {
        int after = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'I':

                    after ++;
                    break;
                case 'V':
                    if ('I' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 2;
                    }
                    after += 5;
                    break;
                case 'X':
                    if ('I' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 2;
                    }
                    after += 10;
                    break;
                case 'L':
                    if ('X' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 20;
                    }
                    after += 50;
                    break;
                case 'C':
                    if ('X' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 20;
                    }
                    after += 100;
                    break;
                case 'D':
                    if ('C' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 200;
                    }
                    after += 500;
                    break;
                case 'M':
                    if ('C' == ( i>=1 ? s.charAt(i-1): 'N')){
                        after -= 200;
                    }
                    after += 1000;
                    break;
                default:
            }

        }
        return after;
    }
}


 class Solution {
    public int XXX(String s) {
        int value = 0;
        for(int i = 0, len = s.length(); i < len; i++)
        {
            char ch = s.charAt(i);
            if (ch == 'I') {
                if (i == len - 1) {
                    value++;
                    continue;
                }
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'V') {
                    value += 4;
                    i++;
                } else if (ch1 == 'X') {
                    value += 9;
                    i++;
                } else {
                    value +=1;
                }
                
            } else if (ch == 'X') {
                if (i == len - 1) {
                    value+=10;
                    continue;
                }
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'L') {
                    value += 40;
                    i++;
                } else if (ch1 == 'C') {
                    value += 90;
                    i++;
                } else {
                    value += 10;
                }
            } else if (ch == 'C') {
                if (i == len - 1) {
                    value+=100;
                    continue;
                }
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'D') {
                    value += 400;
                    i++;
                } else if (ch1 == 'M') {
                    value += 900;
                    i++;
                } else {
                    value += 100;
                }
            } else if (ch == 'V') {
                value += 5;
            } else if (ch == 'L') {
                value += 50;
            } else if (ch == 'D') {
                value += 500;
            } else if (ch == 'M') {
                value += 1000;
            }
        }
        return value;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



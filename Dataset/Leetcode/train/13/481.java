 class Solution {
    public int XXX(String s) {
        char[]  c = s.toCharArray();
        int counts = 0;
        char last = '0';
        for(int i=0;i < c.length;i++) {
            switch (c[i]) {
                case 'I':counts += 1;break;
                case 'V':
                if (last == 'I') {
                    counts += 3;
                } else {
                    counts += 5;
                }
                break;
                case 'X':
                if (last == 'I') {
                    counts += 8;
                } else {
                    counts += 10;
                }
                break;
                case 'L':
                if (last == 'X') {
                    counts += 30;
                } else {
                    counts += 50;
                }
                break;
                case 'C':
                if (last == 'X') {
                    counts += 80;
                } else {
                    counts += 100;
                }
                break;
                case 'D':
                if (last == 'C') {
                    counts += 300;
                } else {
                    counts += 500;
                }
                break;
                case 'M':
                if (last == 'C') {
                    counts += 800;
                } else {
                    counts += 1000;
                }
                break;
            }
            last = c[i];
        }
        return counts;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



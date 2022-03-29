     public String XXX(int num) {
        int[] p = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] s = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        for (int i = p.length - 1; i >= 0; i--) {
            while (num >= p[i]) {
                sb.append(s[i]);
                num -= p[i];
            }
//            使用除法，核心思想一样
//            int tmp = num/p[i];
//            while(tmp!=0){
//                sb.append(s[i]);
//                tmp--;
//            }
            num=num%p[i];
        }
        return sb.toString();
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



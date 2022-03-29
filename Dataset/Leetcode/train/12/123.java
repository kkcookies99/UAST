 class Solution {
 StringBuilder builder = new StringBuilder();
    public String XXX(int num) {
            int n1 = num / 1000;
            builder.append("M".repeat(n1));
            num = num%1000;
            convert(num, 100, "C","M", "D");
            num = num%100;
            convert(num,10,"X","C","L");
            num = num%10;
            convert(num,1,"I","X","V");
            return builder.toString();
        }

    private void convert(int num, int i, String m, String d, String c) {
        int n2 = num/i;
        if(n2==9){
            builder.append(m).append(d);
        }
        else if(n2 == 4){
            builder.append(m).append(c);
        }else {
            if (n2 >= 5) {
                builder.append(c).append(m.repeat(n2 - 5));
            } else {
                builder.append(m.repeat(n2));
            }
        }
    }
}


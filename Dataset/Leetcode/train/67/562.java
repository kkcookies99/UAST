class Solution {
    public String XXX(String a, String b) {
        int target = Math.max(a.length(), b.length());

        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();

        // 将两个字符串补到等长
        if (a.length() < target){
            var how_many_zeros = new StringBuffer();
            for(int i = 0; i < (target - a.length()); i++)
                how_many_zeros.append("0");
            a += how_many_zeros.toString();
        }

        if (b.length() < target){
            var how_many_zeros = new StringBuffer();
            for (int i = 0; i < (target - b.length()); i++)
                how_many_zeros.append("0");
            b += how_many_zeros.toString();
        }

        // 运算
        boolean flag = false;
        var res = new StringBuffer();
        for(int i = 0; i < target; i++){
            if (flag){
                res.append((Character.getNumericValue(a.charAt(i)) ^ Character.getNumericValue(b.charAt(i))) ^ 1);
                if ((a.charAt(i) == b.charAt(i)) && (a.charAt(i) == '0'))
                    flag = false;
            }else{
                res.append(Character.getNumericValue(a.charAt(i)) ^ Character.getNumericValue(b.charAt(i)));
                if ((a.charAt(i) == b.charAt(i)) && (a.charAt(i) == '1'))
                    flag = true;
            }
        }

        if (flag)
            res.append('1');
        
        return res.reverse().toString();
    }
}


 class Solution {
    public String XXX(String a, String b) {
        int len_a = a.length() - 1;
        int len_b = b.length() - 1;

        String res = "";
        int count = 0;
        while (len_a >=0 && len_b >= 0){
            if (a.charAt(len_a--) == '1'){
                count++;
            }
            if (b.charAt(len_b--) == '1'){
                count++;
            }
            if (count % 2 == 0){
                res = 0 + res;
                count = count / 2;
            }else {
                res = 1 + res;
                count = count / 2;
            }
        }
        while (len_a >=0){
            if (a.charAt(len_a--) == '1'){
                count++;
            }
            if (count % 2 == 0){
                res = 0 + res;
                count = count / 2;
            }else {
                res = 1 + res;
                count = count / 2;
            }
        }

        while (len_b >= 0){
            if (b.charAt(len_b--) == '1'){
                count++;
            }
            if (count % 2 == 0){
                res = 0 + res;
                count = count / 2;
            }else {
                res = 1 + res;
                count = count / 2;
            }
        }

        if (count == 1){
            res = 1 + res;
        }

        return res;
    }
}


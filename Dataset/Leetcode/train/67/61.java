 class Solution {
    public String XXX(String a, String b) {
        int n = (a.length() > b.length()) ? a.length() : b.length();
        int[] arr_a = new int[n];
        int[] arr_b = new int[n];
        int idx_a = a.length()-1;
        int idx_b = b.length()-1;
        for(int i = n-1; i >= 0;i--){
            if(idx_a >= 0){
                arr_a[i] = a.charAt(idx_a)-48;
                idx_a--;
            }else{
                arr_a[i] = 0;
            }
            if(idx_b >= 0){
                arr_b[i] = b.charAt(idx_b)-48;
                idx_b--;
            }else{
                arr_b[i] = 0;
            }
        }
        int[] arr_c = new int[n+1];
        int flag = 0;
        for(int i = n; i >= 1;i--){
            arr_c[i] =  arr_a[i-1] + arr_b[i-1] + flag;
            if(arr_c[i] > 1 ){
                flag = 1;
                arr_c[i] %= 2;
            }else{
                flag = 0;
            }
        }
        StringBuffer buffer = new StringBuffer();
        if(flag==1){
            arr_c[0] = 1;
            arr_c[1] %= 2;
            for (int i = 0; i < arr_c.length; i++){
                buffer.append(arr_c[i]);
            }
        }else{
            arr_c[0] = 0;
            for (int i = 1; i < arr_c.length; i++){
            buffer.append(arr_c[i]);
            }
        }
        return buffer.toString();
    }
}


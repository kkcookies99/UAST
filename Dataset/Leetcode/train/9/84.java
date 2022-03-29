class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x); // 效率比 ""+x 高？
        char[] arr = s.toCharArray();
        int n = arr.length  ;
        int n2 = n / 2;
        // 左右两边向中间靠拢
        for(int i=0; i< n2 ; i++){
            if(arr[i] != arr[n-1-i])
                return false;
        }
        return true;
    }
}


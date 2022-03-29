class Solution {
    public boolean XXX(int x) {
        //排除负数
        if (x<0){
            return false;
        }
        //字符串
        String s = String.valueOf(x);
        //x是多少位数
        int num = s.length();
        //中位数
        int midNum= (num/2) +1;
        //分解数字的每一位
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i]= String.valueOf(s.charAt(i));
        }
        //System.out.println(Arrays.toString(arr));
        boolean flag=false;
        for (int i = 0; i < midNum; i++) {
            if (i!=midNum && arr[i].equals(arr[num-i-1])){
                flag=true;
            }else {
                return false;
            }
        }
        return flag;
    }
}


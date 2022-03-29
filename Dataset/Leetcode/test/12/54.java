 class Solution {
    public String XXX(int num) {
        char[] arr = {'I','V','X','L','C','D','M'};
        //反向记录，从结尾开始，最后全部反向
        String[] index = {"0","00","000","10","1","01","001","0001","20"};
        int i=0;
        StringBuffer sb = new StringBuffer();
        while(num>0){
            int a = num%10;
            if(a>0){
                String id = index[a-1];
                char[] ids = id.toCharArray();
                for(char c:ids){
                    sb.append(arr[c-48+i]);
                }
            }
            num = num/10;
            i+=2;
        }
        return sb.reverse().toString();

    }
}


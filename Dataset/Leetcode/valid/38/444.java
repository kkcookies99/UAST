 class Solution {
    public String XXX(int n) {
        if(n == 1)return String.valueOf(n);
        StringBuilder res = new StringBuilder();
        res.append(1);
        //迭代n-1次
        while(n-1>0){
            res = counter(res);
            n--;
        }
        return res.toString();
    }
    
    //
    private StringBuilder counter(StringBuilder str){
        //记录相邻的重复数字
        ArrayList<Integer> number = new ArrayList<>();
        //记录相邻重复数字出现的次数
        ArrayList<Integer> times = new ArrayList<>();
        for(int i =0;i<str.length();){
            int j =i;
            number.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            while(j < str.length() && str.charAt(i)==str.charAt(j) )
                j++;
            times.add(j-i);
            i=j;
        }
        //根据记录重新写出新串
        StringBuilder res = new StringBuilder();
        for(int m = 0;m<times.size();m++){
            res.append(times.get(m));
            res.append(number.get(m));
        }
        return res;
    }
}


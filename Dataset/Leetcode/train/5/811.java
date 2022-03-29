 class Solution {
      public String XXX(String s) {
         if (s== null || s.length() == 0) {
            return "";
        }
        char[] str = manacharString(s);
        int[] pArr = new int[str.length];
        int C = -1;//中心
        int R = -1; //回文右边界再往右的一个位置 最右有效区R-1位置
        int max =Integer.MIN_VALUE;
        for (int i = 0; i != str.length ; i++) {
            pArr[i] = R>i ? Math.min(pArr[2*C-i],R-i) : 1;//最多不用计算的区域 包含了3种小情况
            while(i+pArr[i] < str.length && i - pArr[i] >-1){ //包含了扩展的所有情况
                //包括第二种情况的第三种小情况 以及第一种大情况
                if(str[i+pArr[i]] == str[i - pArr[i]]){
                    pArr[i]++;
                }else {
                    break;
                }
            }
            if(i + pArr[i] > R){
                R = i+pArr[i];
                C = i;
            }
            max = Math.max(max,pArr[i]);
        }
        int cur = 0;
        for(int i=0; i<pArr.length; i++){
            if(pArr[i] == max){
                cur = i;
                break;
            }
        }
        char[] c = new char[2*pArr[cur]];
        int index = 0;
        for (int i = cur-pArr[cur]+1; i <= cur+pArr[cur]-1 ; i++) {
            c[index++] = str[i];
        }
        String s1 = String.valueOf(c);
        s1 = s1.replace("#","");
        return s1.trim();

    }
    private  char[] manacharString(String s) {
        char[] arr = s.toCharArray();
        // #1#2#3#   #1#2#
        char[] values = new char[arr.length*2+1];
        for (int i = 0; i < values.length; i++) {
            if(i % 2 == 0){
                values[i] = '#';
            }else {
                // 0 1 2 3
                values[i] = arr[i/2];
            }
        }
        return values;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



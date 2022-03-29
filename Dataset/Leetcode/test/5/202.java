 class Solution {
    public String XXX(String s) {
        int max = 0;
        int index = 0;
        int start = 0;
        while(index < s.length()){
            int eL = 0;
            start = index - 1;
            
            char temp = s.charAt(index);
            //取出所有相同元素
            while(index < s.length()&&temp == s.charAt(index)){
                index++;
            }
            //保存最后以为同元素地址
            int mid = index;
            //记录同元素长度
            eL = index - start - 1; 
            //中心扩散
            while(start >=  0 && index < s.length()&& s.charAt(start) == s.charAt(index)){
                eL += 2;
                start--;
                index++;
            }
            //重置 + 记录最大值
            if(eL >= max){
                max = eL;
                if(index == s.length()){
                    maxStr = s.substring(start + 1);
                    continue;
                }
                maxStr = s.substring(start + 1,index);
            }
            index = mid;
        }
        return maxStr;
    }
}


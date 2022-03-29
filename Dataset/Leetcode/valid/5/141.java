 class Solution {
    public String XXX(String s) {
        char[] ss = s.toCharArray();
        String res = "";
        for(int i = 0;i < ss.length;i++){
            //倒序遍历i后面的元素
            for(int j = ss.length-1;j >= i+1;j--){
                if(ss[i] == ss[j]){
                    //和最长回文对比大小,小就跳过
                    if(j-i+1 > res.length()){
                        int left = i;
                        int right = j;
                        boolean flag = true;
                        //对比左右是否相等
                        while(++left <= --right){
                            if(ss[left] != ss[right]){
                                flag=false;
                                break;
                            }
                        }
                        if(flag){
                            String st = "";
                            for(int k = i;k <=j;k++){
                                st += ss[k];
                            }
                            res = st;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        //单字符
        if(res.length() == 0 && ss.length != 0){
            res = ss[0]+"";
        }
        return res;
    }
}


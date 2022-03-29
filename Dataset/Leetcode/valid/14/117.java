 class Solution {
    public String XXX(String[] strs) {
        if(strs==null || strs.length==0)return "";
        String res=strs[0];//以第一个字符串为基础
        for(int i=1;i<strs.length;i++){//遍历数组的其他字符串
            while(strs[i].indexOf(res)!=0)//只要res不是前缀，就尾部缩短1个长度
              res=res.substring(0,res.length()-1);//右边的索引不包含在内
        }
        return res;
    }
}


 public String XXX(String[] strs) {
        if(strs.length==0) return "";
        String minStr=strs[0];
        for (String str : strs)
            minStr=minStr.length()<str.length()?minStr:str;//公共前缀小于最短得字符串
        int len=minStr.length();//找出最短字符串
        String pre=null;
        int i=0;
        for (String str : strs) {
            while (str.indexOf(minStr)!=0){
                minStr=minStr.substring(0,minStr.length()-1);//不断缩短最短字符串直到匹配最长公共前缀
            }
            if (minStr.length()==0) return "";
        }
        return minStr;
    }


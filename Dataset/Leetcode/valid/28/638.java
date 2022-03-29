 public int XXX(String haystack, String needle) {

    //判断特殊情况
    if(needle.length()==0)
            return 0;          
    if(haystack.length() < needle.length())
            return -1;

    for(int i = 0;i<=haystack.length()-needle.length();i++){
    //如果第一个相同才进行    
        if(haystack.charAt(i)==needle.charAt(0)){
            //从该字符将字符串截取
            String str = haystack.substring(i,i+needle.length());
            //判断是否相同
            if(str.equals(needle)){
                return i;
            }
        }
        }

    return -1;
}


public String XXX(int n) {
    if(n==1){
        return "1";
    }
    String before = XXX(n-1);//得到需要描述的字符串
    boolean flag = true;
    int num=1;//记录当前描述的数字的数量
    String result="";
    int i;
    for(i = 1; i < before.length();i++){
        if(before.charAt(i) != before.charAt(i-1)){
            result +=""+num+""+before.charAt(i-1);//如果字符改变了就开始描述并且让num归零
            num = 0;
        }
        num++;
    }
    result+=""+num+""+before.charAt(i-1);//最后循环结束一定还有一次
    return result;
}


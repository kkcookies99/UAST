     Map<Integer,String> map = new HashMap<>();
    String str = "";
    String str2 = "";
    int temp = 0;
    for(int i =0;i<s.length();i++){
        //奇数回文
        str = getStr(s,i,i);
        //偶数回文
        str2 = getStr(s,i,i+1);
        temp=temp>str.length()?temp:str.length();
        temp=temp>str2.length()?temp:str2.length();
        if(str.length()>str2.length()){
            map.put(str.length(),str);
        }
        if(str2.length()>str.length()){
            map.put(str2.length(),str2);
        }

    }
    return map.get(temp);
}

private String getStr(String s,int i,int j){
    while(true){
        if(i<0 || j>=s.length() || s.charAt(i)!=s.charAt(j)){
            break;
        }
        i--;
        j++;
    }
	
    if(j>=s.length()){
        return s.substring(i+1);
    }
    return s.substring(i+1,j);
}


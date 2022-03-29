public int XXX(String s) {
    String maxStr="";
    int maxL = 0;
    char[] charArray = s.toCharArray();
    for(char c:charArray){
        if(maxStr.contains(c+"")){
            int index = maxStr.indexOf(c);
            maxStr = maxStr.substring(index+1, maxStr.length())+c;
        }else{
            maxStr = maxStr+c;
            maxL = maxL>maxStr.length()?maxL:maxStr.length();
        }
    }
    return maxL;
}

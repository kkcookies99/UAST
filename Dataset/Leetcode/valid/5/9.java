 class Solution {
    public String XXX(String s) {
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j >i; j--) {
                if(s.charAt(i)==s.charAt(j)){
                    flag=true;
                    int x=i,y=j;
                    while (y>x){
                        x++;
                        y--;
                        if(s.charAt(x)!=s.charAt(y)){
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag){
                    list.add(s.substring(i,j+1));
                    flag=false;
                    break;
                }
            }
        }
        String longestStr="";
        int longest=0;
        if(list.size()==0&&s.length()>0)
            longestStr=s.substring(0,1);
       else {
            for (int i = 0; i < list.size(); i++) {
                String str=list.get(i);
                if(list.get(i).length()>longest){
                    longest=str.length();
                    longestStr=str;
                }
            }
        }
        return longestStr;
    }
}


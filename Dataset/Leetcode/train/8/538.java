 class Solution {
    public int XXX(String s) {
        if(s==null||s.length()==0) return 0;
        int i = 0;
        long ans=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        boolean flag = true;
        for(int j = i;j<s.length();j++){
          if(j==i&&s.charAt(j)=='-'){
              flag = false;continue;
          }
          if(j==i&&s.charAt(j)=='+') continue;
          if(s.charAt(j)>='0'&&s.charAt(j)<='9'){
              ans=ans*10+s.charAt(j)-'0';
              if((int)ans!=ans) return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
          }else break;
        }
        return flag?(int)ans:-(int)ans;
    }
}


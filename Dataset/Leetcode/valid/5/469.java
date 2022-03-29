  public String XXX(String s) {
        int num = 0;
        String ans = "";
        for(int center=0;center<2*s.length()+1;center++){
            int left=center/2;
            int right=center%2+left;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){//
                if(right-left+1>num){
                    num=right-left+1;
                    ans=s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
    return ans;
    }


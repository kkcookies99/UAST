  public String XXX(String s) {
        String ans=""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            int j=0;
            while(i-j>=0&&i+j<s.length()&&s.charAt(i-j)==s.charAt(i+j))
                j++;
            int k=0;
            while(i-k>=0&&i+k-1<s.length()&&s.charAt(i-k)==s.charAt(i+k-1))
                k++;
            if(2*(j-1)+1>ans.length())
                ans=s.substring(i-j+1,i+j);
            if(2*(k-1)>ans.length())
                ans=s.substring(i-k+1,i+k-1);
        }
        return ans;
    }


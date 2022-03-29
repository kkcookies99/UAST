 public boolean XXX(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right&&judge(s.charAt(left))==-1){
                left++;
            }
            while(left<right&&judge(s.charAt(right))==-1){
                right--;
            }
            int result1=judge(s.charAt(left));
            int result2=judge(s.charAt(right));
            if(result1==2&&result2!=2||result1!=2&&result2==2){
                return false;
            }
            if(result1==2&&result2==2&&s.charAt(left)!=s.charAt(right)){
                return false;
            }
            if(result1==0&&result2==0&&s.charAt(left)!=s.charAt(right)){
                return false;
            }
            if(result1==1&&result2==1&&s.charAt(left)!=s.charAt(right)){
                return false;
            }
            if(result1==0&&result2==1&&s.charAt(left)-'a'!=s.charAt(right)-'A'){
                return false;
            }
            if(result1==1&&result2==0&&s.charAt(left)-'A'!=s.charAt(right)-'a'){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    int judge(char c){
        if(c-'a'>=0&&c-'a'<26){//我去，忘了涵盖0
            return 0;
        }
        if(c-'A'>=0&&c-'A'<26){
            return 1;
        }
        if(c-'0'>=0&&c-'0'<10){
            return 2;
        }
        return -1;
    }


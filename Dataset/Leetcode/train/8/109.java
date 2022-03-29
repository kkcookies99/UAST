class Solution {
    public int XXX(String s) {

        int flag=1;
        int i=0;
        for(;i<s.length();i++){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        if(i==s.length()){
            return 0;
        }
        if(s.charAt(i)=='-'){
            i++;
            if(i==s.length()){
                return 0;
            }else if(Character.isDigit(s.charAt(i))){
                        int r='0'-s.charAt(i);
            for(i=i+1;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    int temp = '0'-s.charAt(i);
                    if(r>Integer.MIN_VALUE/10){
                        r=r*10+temp;
                    }else if(r==Integer.MIN_VALUE/10){
                        if(Integer.MIN_VALUE%10<=temp){
                            r=r*10+temp;
                        }else{
                            return Integer.MIN_VALUE;
                        }
                    }else{
                        return Integer.MIN_VALUE;
                    }
                }else{
                    break;
                }
            }
        return r;
                
            }else{
                return 0;
            }

        }else if(s.charAt(i)=='+'){
            i++;
            if(i==s.length()){
                return 0;
            }else if(Character.isDigit(s.charAt(i))){
                 int r=s.charAt(i)-'0';
            for(i=i+1;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    int temp = s.charAt(i)-'0';
                    if(r<Integer.MAX_VALUE/10){
                        r=r*10+temp;
                    }else if(r==Integer.MAX_VALUE/10){
                        if(Integer.MAX_VALUE%10>=temp){
                            r=r*10+temp;
                        }else{
                            return Integer.MAX_VALUE;
                        }
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }else{
                    break;
                }
            }
        return r;
            }else{
                return 0;
            }


        }else if(Character.isDigit(s.charAt(i))){
            int r=s.charAt(i)-'0';
            for(i=i+1;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    int temp = s.charAt(i)-'0';
                    if(r<Integer.MAX_VALUE/10){
                        r=r*10+temp;
                    }else if(r==Integer.MAX_VALUE/10){
                        if(Integer.MAX_VALUE%10>=temp){
                            r=r*10+temp;
                        }else{
                            return Integer.MAX_VALUE;
                        }
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }else{
                    break;
                }
            }
        return r;
        }else{
            return 0;
        }
    }

}



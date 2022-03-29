 class Solution {
    public int XXX(String s) {
         s = s.trim();
         if("".equals(s)) 
            return 0;
        int zfStatus = -1;//-1:未判,0为+，1为-
        List<Integer> list = new ArrayList<>();
        long res = 0;
        boolean isEffectiveNum = false;
        int j=0;
        for(int i=0;
        i<s.length()&&(s.charAt(i)-'0'>=0&&'9'-s.charAt(i)>=0&&i!=0)||i==0&&(s.charAt(i)=='-'||s.charAt(i)=='+'||(s.charAt(i)-'0'>=0&&'9'-s.charAt(i)>=0));
        i++,j++){
            if(false == isEffectiveNum && s.charAt(i)=='0'){
                j--;
                continue;
            }
            if(zfStatus==-1){
                if(s.charAt(0)=='+'){
                    zfStatus = 0;
                }else if(s.charAt(0)=='-'){
                    zfStatus = 1;
                }else{
                    zfStatus = 0;
                    isEffectiveNum = true;
                    list.add(s.charAt(i)-'0');
                }
                continue;
            }
            isEffectiveNum = true;
            list.add(s.charAt(i)-'0');
            if(j>11){
                    if(zfStatus==0){
                        return 2147483647;
                    }else{
                        return -2147483648;
                    }
            }
        }
        //System.out.println(list);
        long pow = 1;
        long resMax = res;
        if(list.size()>0){
            for(int i=list.size()-1;i>=0;i--){
                res += list.get(i)*pow;
                resMax = resMax>res?resMax:res;
                if(res<resMax){
                    if(zfStatus==0){
                        return 2147483647;
                    }else{
                        return -2147483648;
                    }
                }
                pow*=10; 
                //System.out.println(res);
            }
            res = zfStatus == 0? res:-1*res;
            //System.out.println(res);
            //System.out.println(res<-2147483648L);
            if(res>2147483647L){
                return 2147483647;
            }else if(res<-2147483648L){
                //System.out.println("here");
                return -2147483648;
            }else{
                return (int)res;
            }
        }
        return 0;
    }
}


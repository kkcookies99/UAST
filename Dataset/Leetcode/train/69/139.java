class Solution {
    public int XXX(int x) {
        if(x==0){
            return 0;
        }
        int level=0;
        int curNum=x;
        while(curNum>0){
            curNum/=10;
            level++;
        }
        if(level%2==1){
            level-=1;
        }else{
            level-=2;
        }
        int temp1=1;
        for(int i=1;i<=level;i++){
            temp1*=10;
        }
        Integer result=null;
        while(temp1>=1){
            curNum=x/temp1;
            if(result==null){
                int i=0;
                for(i=9;i>=1;i--){
                    if(i*i<=curNum){
                        result=i;
                        break;
                    }
                }
                x=x-i*i*temp1;
            }else{
                int m=0;
                int i=0;
                for(i=9;i>=1;i--){
                    m = 20*result+i;
                    if(m*i<=curNum){
                        break;
                    }
                }
                if(i!=0){
                    x=x-m*i*temp1;
                    result=result*10+i;  
                }else{
                    result=result*10;
                }
            }
            temp1=temp1/100;
        }
        return result;
    }
}


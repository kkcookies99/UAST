class Solution {
    public String XXX(String a, String b) {
            String  str="";
            int point=0;
            if(a.length()>b.length()){
                for(int k=a.length()-b.length();k>0;k--){
                    b=("0")+b;
                }
            }else{
                for(int v=b.length()-a.length();v>0;v--){
                    a=("0")+a;
                }
            }
           // System.out.println(a+" "+b);

            
            int i=a.length()-1;
            for( i=a.length()-1 ;i>=0;i--){
                
                int ch=(int)a.charAt(i)-48;
               
                int ch1=(int)b.charAt(i)-48;                                  

                if(ch+ch1==0 && point==0){
                    str=("0"+str);
                }else if(ch+ch1==1 && point==0){
                    str=("1"+str);
                }else if(ch+ch1==1 && point==1){
                    str=("0"+str);
                    point=1;    
                }else if(ch+ch1==2 && point==0){
                    str=("0"+str);
                    point=1;
                }else if(ch1+ch==2 && point==1){
                    str=("1"+str);
                }else if(ch+ch1==0 && point==1){
                    str=("1"+str);
                    point=0;
                }
            }

            
        return point==0 ? str:"1"+str;



    }
}


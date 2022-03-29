 public String XXX(String a, String b) {
    int aL = a.length();
    int bL =b.length();
    int maxL =aL>bL?aL:bL;
    for(int i=aL;i<maxL;i++){
        a="0"+a;
    }
    for(int i=bL;i<maxL;i++){
        b="0"+b;
    }
    String r = "";
    char temp= '0';
    for(int i=maxL-1;i>=0;i--){
        if(temp=='1'){
            //temp ==1
            if(a.charAt(i)=='1'){
                //a==1
                if(b.charAt(i)=='1'){
                    //1 1 1
                    temp = '1';
                    r="1"+r;
                }else{
                    //1 1 0
                    temp = '1';
                    r="0"+r;
                }
            }else{
                //a==0
                if(b.charAt(i)=='1'){
                    //1 0 1
                    temp = '1';
                    r="0"+r;
                }else{
                    //1 0 0
                    temp = '0';
                    r="1"+r;
                }
            }


        }else{
            //temp == 0
             if(a.charAt(i)=='1'){
                //a==1
                if(b.charAt(i)=='1'){
                    //0 1 1
                    temp = '1';
                    r="0"+r;
                }else{
                    //0 1 0
                    temp = '0';
                    r="1"+r;
                }
            }else{
                //a==0
                if(b.charAt(i)=='1'){
                    // 0 0 1
                    temp = '0';
                    r="1"+r;
                }else{
                    // 0  0 0
                    temp = '0';
                    r="0"+r;
                }
            }
        }


    }
    if(temp=='1'){
        return "1"+r;
    }else{
        return r;
    }


    
}


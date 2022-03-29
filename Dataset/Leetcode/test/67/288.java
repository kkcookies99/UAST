 class Solution {
    public String XXX(String a, String b) {
        boolean cs= false;
        int la = a.length();
        int lb = b.length();        
        if(la>lb){           
            for(int i=0;i<la-lb;i++){
                b="0"+b;
            }
        }else{
            for(int i=0;i<lb-la;i++){
                a="0"+a;
            }
        }
        char[] ach = a.toCharArray();
        char[] bch = b.toCharArray();
        String s = "";
        for(int i=Math.max(la,lb)-1;i>=0;i--){
            if(ach[i]=='0'&&bch[i]=='0'){
                if(cs==true){
                    s="1"+s;
                    cs = false; 
                }else{
                    s="0"+s;
                    cs = false;
                }
            }else if((ach[i]=='1'&&bch[i]=='0')||(ach[i]=='0'&&bch[i]=='1')){
                if(cs==true){
                    s="0"+s; 
                    cs = true;
                }else{
                    s="1"+s;
                     cs = false; 
                }
            }else if(ach[i]=='1'&&bch[i]=='1'){
               if(cs==true){
                    s="1"+s; 
                    cs = true;
                }else{
                    s="0"+s;
                     cs = true; 
                }
            }
        }
        if(cs==true){
            s="1"+s;
        }
        return s;
    }
}


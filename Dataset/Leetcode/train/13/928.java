 class Solution {
    public int XXX(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            String s1 = s.substring(i,i+1);
            String s2 = "";
            if(i+2<=s.length()){
                 s2 = s.substring(i+1,i+2);
            }
            String s3 = s1+s2;
            if(s3.equals("IV")){
                res+=4;
                i++;
            }
            else if(s3.equals("IX")){
                res+=9;
                i++;
            }
            else if(s3.equals("XL")){
                res+=40;
                i++;
            }
            else if(s3.equals("XC")){
                res+=90;
                i++;
            }
            else if(s3.equals("CD")){
                res+=400;
                i++;
            }
            else if(s3.equals("CM")){
                res+=900;
                i++;
            }else{
                switch(s1){
                case("I"):
                    res+=1;
                    break;
                case("V"):
                    res+=5;
                    break;
                case("X"):
                    res+=10;
                    break;
                case("L"):
                    res+=50;
                    break;
                case("C"):
                    res+=100;
                    break;
                case("D"):
                    res+=500;
                    break;
                case("M"):
                    res+=1000;
                    break;
              }
            }
            
        }
        return res;
    }
}


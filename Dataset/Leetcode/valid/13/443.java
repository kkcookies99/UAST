 class Solution {
    public int XXX(String s) {
        int sum = 0,len = s.length();

        for(int i=0;i<len;i++){
            if(s.charAt(i) == 'I'){
                //判断是否在V或者X左边
                if(i+1<len){
                    if(s.charAt(i+1) == 'V'){
                        sum+=4;
                        i++;
                    }else if(s.charAt(i+1) == 'X'){
                        sum +=9;
                        i++;
                    }else{
                        sum+=1;
                    }
                }else{
                    sum+=1;
                }
            }else if(s.charAt(i) == 'V'){
                sum+=5;
            }else if(s.charAt(i) == 'X'){
                //判断是否在L或者C左边
                if(i+1<len){
                    if(s.charAt(i+1) == 'L'){
                        sum+=40;
                        i++;
                    }else if(s.charAt(i+1) == 'C'){
                        sum +=90;
                        i++;
                    }else{
                        sum+=10;
                    }
                }else{
                    sum+=10;
                }
            }else if(s.charAt(i) == 'L'){
                sum+=50;
            }else if(s.charAt(i) == 'C'){
                //判断是否在D或者M左边
                if(i+1<len){
                    if(s.charAt(i+1) == 'D'){
                        sum+=400;
                        i++;
                    }else if(s.charAt(i+1) == 'M'){
                        sum +=900;
                        i++;
                    }else{
                        sum+=100;
                    }
                }else{
                    sum+=100;
                }
            }else if(s.charAt(i) == 'D'){
                sum+=500;
            }else if(s.charAt(i) == 'M'){
                sum+=1000;
            }
        }
        return sum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



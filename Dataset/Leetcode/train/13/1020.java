 class Solution {
    public int XXX(String s) {
            //将字符串转换成char数组
            char[] c;
            c = s.toCharArray();
            int y=0;
            int i=0;
            while(i<c.length){
                if(c[i]=='M'){
                    y+=1000;
                }else if(c[i]=='D'){
                        y+=500;
                }else if(c[i]=='C'){
                    //如果到达了最后一位的话
                    if(i==c.length-1){
                        y+=100;
                        break;
                    }
                    //如果下一位是D或者M
                    if(c[i+1]=='D'||c[i+1]=='M')
                            {
                            y-=100;
                            i++;
                            continue;
                        }
                    y+=100;
                }else if(c[i]=='L'){
                    y+=50;
                }else if(c[i]=='X'){
                    //如果到达了最后一位的话                   
                    if(i==c.length-1){
                        y+=10;
                        break;
                    }
                    //如果下一位是L或者C
                    if(c[i+1]=='L'||c[i+1]=='C')
                            {
                            y-=10;
                            i++;
                            continue;
                        }
                    y+=10;
                }else if(c[i]=='V'){
                        y+=5;
                }else if(c[i]=='I'){
                    //如果到达了最后一位的话
                    if(i==c.length-1){
                        y+=1;
                        break;
                    }
                    //如果下一位是V或者X
                    if(c[i+1]=='V'||c[i+1]=='X')
                        {
                            y-=1;
                            i++;
                            continue;
                        }
                    y+=1;
                }
                i++;
            }
            return y;
    }
}


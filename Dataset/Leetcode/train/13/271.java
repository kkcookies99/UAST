class Solution {
    public int XXX(String s) {
        char[] cs=s.toCharArray();
        int count=0;
        for(int i=0;i<cs.length;i++){
            switch (cs[i]){
                case 'I':{
                    count=count+1;
                    if((i<cs.length-1) && cs[i+1]=='V'){
                        count=count+3;
                        i++;
                    }else if( (i<cs.length-1) && cs[i+1]=='X'){
                        count=count+8;
                        i++;
                    }
                }break;
                case 'X':{
                    count=count+10;
                    if((i<cs.length-1) && cs[i+1]=='L'){
                        count=count+30;
                        i++;
                    }else if((i<cs.length-1) &&  cs[i+1]=='C'){
                        count=count+80;
                        i++;
                    }
                }break;
                case 'C':{
                    count=count+100;
                    if((i<cs.length-1) && cs[i+1]=='D'){
                        count=count+300;
                        i++;
                    }else if((i<cs.length-1) &&  cs[i+1]=='M'){
                        count=count+800;
                        i++;
                    }
                }break;
                case 'V':{
                    count=count+5;
                }break;
                case 'L':{
                    count=count+50;
                }break;
                case 'D':{
                    count=count+500;
                }break;
                case 'M':{
                    count=count+1000;
                }break;

            }
        }
        return count;
    }
}


class Solution {
    public int XXX(String str) {
        String temp = str.trim();
        char[] ch = temp.toCharArray();
        int sum = 0,idx = 0,sys = 1;

        if(ch.length==0){
            return 0;
        }

        else{

            if(ch[idx]=='+'||ch[idx]=='-'){
                sys = ch[idx]=='+'?1:-1;
                idx++;
            }

            else if(!(ch[idx]>=48&&ch[idx]<=57)){
                return 0;
            }

            for(int i=idx;i<ch.length;i++){
                int num = ch[i]-'0';
                if(num>=0&&num<=9){
                    if((Integer.MAX_VALUE-num)/10<sum){
                        return sys==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                    }
                    sum = sum*10+num;
                }
                else{
                    break;
                }
            }
            
            return sys*sum;
        }

    }
}


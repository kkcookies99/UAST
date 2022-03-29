 class Solution {
    public int XXX(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i==s.length()-1||(s.charAt(i+1)!='V'&&s.charAt(i+1)!='X')){
                    ans+=getNum(s.charAt(i));
                }else if(s.charAt(i+1)=='V'){
                    ans+=4;
                    i++;
                }else if(s.charAt(i+1)=='X'){
                    ans+=9;
                    i++;
                }
            }else if(s.charAt(i)=='X'){
                if(i==s.length()-1||(s.charAt(i+1)!='L'&&s.charAt(i+1)!='C')){
                    ans+=getNum(s.charAt(i));
                }else if(s.charAt(i+1)=='L'){
                    ans+=40;
                    i++;
                }else if(s.charAt(i+1)=='C'){
                    ans+=90;
                    i++;
                }
            }else if(s.charAt(i)=='C'){
                if(i==s.length()-1||(s.charAt(i+1)!='D'&&s.charAt(i+1)!='M')){
                    ans+=getNum(s.charAt(i));
                }else if(s.charAt(i+1)=='D'){
                    ans+=400;
                    i++;
                }else if(s.charAt(i+1)=='M'){
                    ans+=900;
                    i++;
                }
            }else{
                ans+=getNum(s.charAt(i));
            }
        }
        return ans;
    }
    private int getNum(char s)
    {
        switch(s)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


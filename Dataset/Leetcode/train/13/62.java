public int XXX(String s) {
    int sum = 0;
    for(int i=0;i<s.length()-1;i++){
        int preNum = getValue(s.charAt(i));
        int num = getValue(s.charAt(i+1));
        if(preNum>=num){
            sum+=preNum;
        }
        else{
            sum-=preNum;
        }
    }
    return sum+=getValue(s.charAt(s.length()-1));
    }
    private int getValue(char ch) {
        switch(ch) {
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


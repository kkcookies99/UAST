class Solution {
    public int XXX(String s) {
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'I':
                    if(i+1<s.length()){
                        if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')
                            num--;
                        else
                            num++;
                    }
                    else
                        num++;
                    break;
                case 'V':
                    num=num+5;
                    break;
                case 'X':
                    if(i+1<s.length()){
                        if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')
                            num=num-10;
                        else
                            num=num+10;
                    }
                    else
                        num=num+10;
                    break;
                case 'L':
                    num=num+50;
                    break;
                case 'C':
                    if(i+1<s.length()){
                        if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')
                            num=num-100;
                        else
                            num=num+100;
                    }
                    else
                        num=num+100;
                    break;
                case 'D':
                    num=num+500;
                    break;
                case 'M':
                    num=num+1000;
                    break;
                default:
                    System.out.println("输出错误！");
                    return -1;

            }
        }
        return num;
    }
}


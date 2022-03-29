 class Solution {
    public boolean XXX(String s) {
        int n = s.length();
        if(n == 0 || n == 1)return false;
        Stack<Character> arr = new Stack<Character>();
        for(int i = 0; i < n ; i ++){
            if(judge(s.charAt(i)) <= 3 && judge(s.charAt(i)) >= 1){
                arr.push(s.charAt(i));
            }//压入栈顶
            else{
                if(arr.empty() == true)return false;
                else{
                    if(mate(arr.peek(),s.charAt(i)) == true){
                        arr.pop();
                    }else{
                        return false;
                        }
                    }
                }
        }
        if(arr.empty() == true)return true;
        return false;
    }
    public int judge(char c){
        if(c == '(')return 1;
        else if (c == '[')return 2;
        else if (c == '{')return 3;
        else if (c == '}')return 4;
        else if (c == ']')return 5;
        else if (c == ')')return 6;
        return 0;
    }
    public boolean mate(char c1,char c2){
        if(judge(c1) == 1 && judge(c2) == 6)return true;
        else if(judge(c1) == 2 && judge(c2) == 5)return true;
        else if(judge(c1) == 3 && judge(c2) == 4)return true;
        return false;
    }
    
}


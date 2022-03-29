 class Solution {
    public boolean XXX(String s) {
        if(s == null || s.length() == 1){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
    
        char[] arr = s.toCharArray();
        int ptr = 1;
        int[] myStack = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            switch(arr[i]){
                case '(':val = -1;break;
                case ')':val = 1;break;
                case '[':val = -2;break;
                case ']':val = 2;break;
                case '{':val = -3;break;
                case '}':val = 3;break;
                default:break;
            }

            if(i == 0){
                myStack[ptr] = val;
                continue;
            }

            if(myStack[ptr] + val == 0){
                myStack[ptr--] = 0;
            }else{
                myStack[++ptr] = val;
            }
        }
        return myStack[1] == 0;
    }
}


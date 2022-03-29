 class Solution {
    public boolean XXX(String s) {
        int n = s.length();
        if(n==0)return true;
        LinkedList<Character> inn = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                inn.push(s.charAt(i));
            }else {
                if(inn.isEmpty())return false;
                char leftBracket = inn.pop();
                char rightBracket = s.charAt(i);
                if(!((rightBracket==')'&&leftBracket=='(')||(rightBracket==']'&&leftBracket=='[')||(rightBracket=='}'&&leftBracket=='{')))return false;
            }

        }

        return inn.isEmpty();
    }
}


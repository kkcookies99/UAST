 class Solution {
    public boolean XXX(String s) {
        if(s.length() == 0){
                    return true;
                }

                if(s.length()%2 ==1){
                    return false;
                }

                Stack<Character> stack = new Stack<Character>();
                for(int i=0;i<s.length();i++){

                    Character data = s.charAt(i);

                    int  count = stack.size();
                    if(count == 0){
                        stack.push(data);
                    }else{
                        Character compare = stack.lastElement();

                       if(isCouple(compare,data)){
                           stack.pop();
                       }else{
                           stack.push(data);
                       }
                    }

                }
                if(stack.size() ==0){
                    return true;
                }
                return false;
    }

    public  boolean isCouple(Character a,Character b){

                if(a.equals('(') & b.equals(')'))
                    return true;

                if(a.equals('{') & b.equals('}'))
                    return true;

                if(a.equals('[') & b.equals(']'))
                    return true;

                return false;
            }


}


 class Solution {
    public boolean XXX(String s) {
        if(s.length()==0)
            return true;
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
                      
        for(int i=0;i<s.length();i++){
            System.out.println(stack.isEmpty());
            if(!stack.isEmpty()){
                char temp=stack.peek();
                if(map.containsKey(temp)){
                    if(map.get(temp)==s.charAt(i))
                        stack.pop();
                    else
                        stack.push(s.charAt(i)); 
                }else{
                    return false;
                }     
            }else{
                 stack.push(s.charAt(i));
            }  
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}  


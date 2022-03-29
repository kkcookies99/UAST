 class Solution {
    public boolean XXX(String s) {
        if(s.length()==0) return true;

        HashMap hashMap=new HashMap();
        hashMap.put(")","(");
        hashMap.put("}","{");
        hashMap.put("]","[");

        Stack stack=new Stack();
        stack.push(s.substring(0,1));

        for(int i=1;i<s.length();i++){
            if(hashMap.containsKey(s.substring(i,i+1))&&stack.size()!=0){
                if(stack.peek().toString().equals(hashMap.get(s.substring(i,i+1)).toString())){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(s.substring(i,i+1));
            }
        }
        return stack.size()>0?false:true;

    }
}


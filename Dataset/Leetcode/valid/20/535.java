 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack=new Stack<>();
        char[] charArray=s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            char ch=charArray[i];
            if(ch=='('||ch=='{'||ch=='['){
                if(ch=='('){
                    stack.push(')');
                }else if(ch=='{'){
                    stack.push('}');
                }else{
                    stack.push(']');
                }
            }else if(stack.isEmpty()||stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



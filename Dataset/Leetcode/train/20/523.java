 class Solution {
    public boolean XXX(String s) {
        //如果s的长度不能被2整除那证明有多余的
        if(s.length()%2!=0) return false;
        Deque<Character> deque = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(c == '{'){
                deque.push('}');
            }else if(c == '('){
                deque.push(')');
            }else if(c == '['){
                deque.push(']');
            }else{
                if(deque.isEmpty() || c != deque.pop()){
                    return false;
                }
            }
        }
        if(deque.isEmpty()) return true;
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



 class Solution {
    List<String> list = new ArrayList<String>();
    public List<String> XXX(int n) {
        Map<String,Integer> map = new HashMap<>();
        map.put("(",n);
        map.put(")",n);
        fun(map,new StringBuffer());
        return list;
    }
    public void fun(Map<String,Integer> choice,StringBuffer now){
        Set<String> set = choice.keySet();
        if((Integer)choice.get("(")==0&&(Integer)choice.get(")")==0){
            if(isValid(now.toString())==true){
                list.add(now.toString());
                return;
            }
        }
        for(String key:set){
            if((Integer)choice.get(key)==0){
                continue;
            }
            now.append(key);
            choice.put(key,choice.get(key)-1);
            fun(choice,now);
            choice.put(key,choice.get(key)+1);
            now.deleteCharAt(now.lastIndexOf​(key));
        }
    }
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char now = s.charAt(i);
            if(!(now==')'||now=='}'||now==']')){
                stack.push(now);
            }else{
                if(stack.size()==0){
                    return false;
                }
                char top = stack.pop();
                if((top=='{'&&now=='}')||(top=='('&&now==')')||(top=='['&&now==']')){
                    continue;
                }else{ 
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}


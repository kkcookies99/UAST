 class Solution {
    public boolean XXX(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c =='(' || c == '[' || c == '{'){
                list.add(c);
            }else{
                if(list.size()>0 && map.get(list.get(list.size()-1)).equals(c)){
                    list.remove(list.size()-1);
                }else{
                    return false;
                }
            }
        }
        if(list.size()>0) return false;
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


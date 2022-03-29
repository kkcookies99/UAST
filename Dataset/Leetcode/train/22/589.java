 class Solution {
    public List<String> XXX(int n) {
        Set<String> set = new HashSet<>();
        set.add("()");
        for(int i=0;i<n-1;i++){
            Set<String> set1 = new HashSet<>();
            for(String s:set){
                for(int j=1;j<s.length();j++){
                    if(s.charAt(j)==')'){
                        StringBuilder sb = new StringBuilder(s);
                        sb.insert(j,'(');
                        for(int k=0;k<sb.length()-1;k++){
                            if(sb.charAt(k)=='('){
                                StringBuilder sb1 = new StringBuilder(sb);
                                sb1.insert(k+1,')');
                                String s1 = sb1.toString();
                                if(isValid(s1)){
                                    set1.add(s1);
                                }
                            }
                        }
                    }
                }
            }
            set = set1;
        }
        return new ArrayList<String>(set);
    }
    public boolean isValid(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count<0) return false;
        }
        return true;
    }
}


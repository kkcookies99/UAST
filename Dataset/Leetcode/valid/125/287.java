 class Solution {
    public boolean XXX(String s) {
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(!(s.charAt(low)>='0'&&s.charAt(low)<='9')&&
            !(s.charAt(low)>='a'&&s.charAt(low)<='z')&&
            !(s.charAt(low)>='A'&&s.charAt(low)<='Z')){
                low++;
                continue;
            }
            if(!(s.charAt(high)>='0'&&s.charAt(high)<='9')&&
            !(s.charAt(high)>='a'&&s.charAt(high)<='z')&&
            !(s.charAt(high)>='A'&&s.charAt(high)<='Z')){
                high--;
                continue;
            }
            if(((s.charAt(low)>='0'&&s.charAt(low)<='9')&&!(s.charAt(high)>='0'&&s.charAt(high)<='9'))||
            ((s.charAt(high)>='0'&&s.charAt(high)<='9')&&!(s.charAt(low)>='0'&&s.charAt(low)<='9'))||
            (s.charAt(low)-'a'!=s.charAt(high)-'a'&&Math.abs((s.charAt(low)-'a')-(s.charAt(high)-'a'))!=32)) 
            return false;
            low++;
            high--;
        }
        return true;
    }
}


 class Solution {
    public boolean XXX(String s) {
        String tmp = "";
        char c;
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                tmp+=new String(new char[]{c});
            }
        }
        String[] arr = tmp.split("");
        for(int i=0;i<arr.length/2;i++){
            if(!arr[i].equalsIgnoreCase(arr[arr.length-1-i])){
                return false;
            }
        }
        return true;
    }
}


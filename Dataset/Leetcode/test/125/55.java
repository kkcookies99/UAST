 class Solution {
    public boolean XXX(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]","");
        res = res.toLowerCase();
        System.out.print(res);
        int left = 0;
        int right = res.length()-1;
        boolean flag = true;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                flag = false;
            }
            left++;
            right--;
        }
        return flag;
    }
}


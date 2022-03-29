 class Solution {
    public int XXX(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = new char[]{'I','V','X','L','C','D','M'};
        int[] nums = new int[]{1,5,10,50,100,500,1000};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],nums[i]);
        }
        char[] arrS = s.toCharArray();
        int res = 0;
        for(int i=0;i<arrS.length;i++){
            if(i < arrS.length-1){
                if(map.get(arrS[i]) < map.get(arrS[i+1])){
                    res -= map.get(arrS[i]);
                }else{
                    res += map.get(arrS[i]);
                }
            }else{
                res += map.get(arrS[i]);
            }
        }
        return res;
    }
}


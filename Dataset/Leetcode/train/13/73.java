class Solution {
    public int XXX(String s) {
        int [] nums= {1,5,10,50,100,500,1000};
		char [] romans= {'I','V','X','L','C','D','M'};
		char [] arr=s.toCharArray();
		int res=0;
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		for(int i=0;i<nums.length;i++) {
			hashMap.put(romans[i], nums[i]);
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(i==arr.length-1) {
				res+=hashMap.get(arr[i]);
				continue;
			}
			if(hashMap.get(arr[i])<hashMap.get(arr[i+1])) {
				res-=hashMap.get(arr[i]);
			}else {
				res+=hashMap.get(arr[i]);
			}
		}
		return res;
    }
}


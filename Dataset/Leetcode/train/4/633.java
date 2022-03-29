 class Solution {
    public double XXX(int[] nums1, int[] nums2) {   
		int m = 0;
		int n = 0;	
		ArrayList<Integer> nums3 = new ArrayList<Integer>();
				if(nums1 != null) {
			m = nums1.length;
			for(int i=0;i<nums1.length;i++) {
				nums3.add(nums1[i]);
			}
		}
		if(nums2 != null) {
			n = nums2.length;
			for(int j=0;j<nums2.length;j++) {
				nums3.add(nums2[j]);
			}
		}
		nums3.sort(Comparator.naturalOrder());
		System.out.println(nums3);
		int avg = (m + n) %2; 
		int avgg = (m + n) /2;
		if(avg == 0) {
			System.out.println(nums3.get(avgg)+nums3.get(avgg-1));
			double d1 = nums3.get(avgg);
			double d2 = nums3.get(avgg-1);
			double d = (d1+d2)/2.00000; 
			return d;
		}
		else {
			return nums3.get(avgg);
		}
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



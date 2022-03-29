 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int a=0,b=0;
        double c=0;
        a=(list.size()-1)/2+1;
        b=list.size()/2;
        if (list.size()%2!=0){
           c= list.get(a-1);
        }else {
               c=(double) (list.get(b)+list.get(b-1))/2;
        }
       return c;
    }
}


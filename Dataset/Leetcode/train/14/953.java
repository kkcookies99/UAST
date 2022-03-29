 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0)return "";
        Arrays.sort(strs);//按字符顺序排序,比较第一个与最后一个相同字符即可
        char[] arr1=strs[0].toCharArray();
        char[] arr2=strs[strs.length-1].toCharArray();

        int len1=arr1.length,len2=arr2.length,min=Math.min(len1,len2);
        StringBuffer res =new StringBuffer();

       for(int i=0;i<min;i++)
       {
           if(arr1[i]==arr2[i])res.append(arr1[i]);
           else break;

       }
       return res.toString();
    }
}


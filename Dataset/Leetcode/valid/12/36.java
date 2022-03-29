 class Solution {
    public String XXX(int num) {
        StringBuilder str=new StringBuilder();
        String[]sarr=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[]arr=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<13;i++)
            while(num>=arr[i]) 
            {
                str.append(sarr[i]);
                num-=arr[i];
            }
        return str.toString();
    }
}


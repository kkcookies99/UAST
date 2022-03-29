 class Solution {
    public String XXX(String a, String b) {
            int n = a.length();
            int m = b.length();
            int arr[] = new int[n];
            int brr[] = new int[m];
            int ax = 0;
            int bx = 0;
            String ans = "";
            for(int i = 0;i<n;i++)
            {
                arr[i] = a.charAt(i)-'0';
            }
            for(int i = 0;i<m;i++)
            {
                brr[i] = b.charAt(i)-'0';
            }
            for(int i =0;i<n;i++)
            {
                ax+=arr[i]*Math.pow(2,n-1-i);
            }
            for(int i =0;i<m;i++)
            {
                bx+=brr[i]*Math.pow(2,m-1-i);
            }
            int sum = ax+bx;
            while(sum!=0)
            {
                int x= sum%2;
                sum/=2;
                ans+=Integer.toString(x);
            }
            return new StringBuffer(ans).reverse().toString();
    }
}


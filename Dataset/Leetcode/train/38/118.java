public String XXX(int n) {
        if(n == 1)return Integer.toString(1);
        String ans="1";
        for(int i=1; i<n;i++){
            ans=findCount(ans);
        }
        return ans;
    }
    
    public static String findCount(String n){
        char[] nums = n.toCharArray();
        int[] count =new int[10];
        char bef = nums[0];
        StringBuilder ans = new StringBuilder();
        for(char c: nums){
            if(c == bef){
                count[c - '0']++;
            }else{
                ans.append(count[bef-'0']);
                ans.append(bef);
                count[bef - '0'] = 0;
                bef = c;
                count[c - '0']++;
            }
            //System.out.println(c + "   " + bef + "   " + count[bef - '0']);
        }
        ans.append(count[bef-'0']);
        ans.append(bef);
        return ans.toString();
    }


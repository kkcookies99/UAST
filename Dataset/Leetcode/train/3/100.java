 /*滑动窗口*/
    public int XXX(String s) {
        Set<Character> set=new HashSet<>();
        int res = 0;char [] arr=s.toCharArray();
        for (int i = 0, j = 0; j < arr.length; j ++ )
        {   
            char c=arr[j];
            //remove from window
            while (set.contains(c))
                set.remove(arr[i++]);
            //add to right;
            set.add(c);
            
            res = Math.max(res, j - i + 1);
        }
        return res;
    }


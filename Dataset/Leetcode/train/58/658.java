class Solution {
    public int XXX(String s) {
        s = s.trim();

        int idx = s.lastIndexOf(" ");

        System.out.println("idx:" + idx);

        if (idx < 0 && s.length()==0){
            return 0;
        }

        return s.substring(idx + 1).length();

/*        String[] splits = s.split(" ");
        System.out.println("len:" + splits.length);
        if (splits.length == 0){
            return 0;
        } else {
            return splits[splits.length - 1].length();
        }*/
    }
}


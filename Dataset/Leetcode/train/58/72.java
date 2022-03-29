 class Solution {
    public int XXX(String s) {
        String[] arr = s.split(" ");
        if(arr.length == 0) return 0;
        else return arr[arr.length-1].length();
    }
}


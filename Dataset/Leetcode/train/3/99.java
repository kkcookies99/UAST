 public class Solution {
    public int XXX(String s) {
        int count = 0;
        List<Object> list = new ArrayList<>();
        int length = s.length();
        for (int i = 0;i<length;i++){
            char c = s.charAt(i);
            while (list.indexOf(c)>=0) {
                list.remove(0);
            }
            list.add(c);
            count = list.size() > count ? list.size() : count;
        }
        return count;
    }
}


 class Solution {
    public String XXX(int n) {

        if(n==1)
            return "1";

        String last = XXX(n-1);

        return getRepeat(last);
    }



    public String getRepeat(String last){  
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        int num = 1;
        char a = last.charAt(0);
        list1.add(a);
        for (int i = 1; i < last.length(); i++) {
            if(last.charAt(i)==a){
                num++;
            }
            else {
                list.add(num);
                num = 1;
                a = last.charAt(i);
                list1.add(a);
            }
        }
        list.add(num);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            s.append(list.get(i)).append(list1.get(i));
        }
        return s.toString();
    }
}


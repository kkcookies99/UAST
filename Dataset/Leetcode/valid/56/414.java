 class Solution {
    public int[][] XXX(int[][] intervals) {
        Ints[] output = new Ints[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            output[i] = new Ints(intervals[i]);
        }
        Arrays.sort(output, new Comparator<Ints>(){
            @Override
            public int compare(Ints o1, Ints o2){
                return o1.data[0] - o2.data[0];
            }
        });
        List<Ints> output_list = new ArrayList<>();
        for(int i = 0; i < output.length; i++){
            output_list.add(output[i]);
        }
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = output_list.size() -2; i >= 0; i--){
                if(check(output_list.get(i).data, output_list.get(i+1).data)){
                    output_list.add(i, heti(output_list.get(i).data, output_list.get(i+1).data));
                    output_list.remove(i+1);
                    output_list.remove(i+1);
                    flag = true;
                }
            }
        }

        int[][] real_output = new int[output_list.size()][2];
        for(int i = 0; i < output_list.size(); i++){
            real_output[i] = output_list.get(i).data;
        }
        return real_output;
    }

    public boolean check(int[] a, int[] b){
        if(a[1] >= b[0] && b[1] >= a[0])return true;
        return false;
    }

    public Ints heti(int[] a, int[] b){
        return new Ints(new int[] {Math.min(a[0],b[0]), Math.max(a[1], b[1])});
    }
}

class Ints {
    public int[] data;
    public Ints(int[] a){
        data = a;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



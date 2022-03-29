 class Solution {
    public double XXX(int[] arr1, int[] arr2) {
        double result;
        List<Integer> integers = new ArrayList<>(arr1.length+arr2.length);
        int maxSize = arr1.length>arr2.length? arr1.length:arr2.length;
        for(int i = 0 ; i < maxSize;i++){
            if(arr1.length > i)integers.add(arr1[i]);
            if(arr2.length > i)integers.add(arr2[i]);
        }
        if(integers.size() == 0) return 0.0;
        if(integers.size() == 1) return integers.get(0)*1.0;
        integers = integers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        if(integers.size() % 2 == 0){
            int index = (integers.size()-1)/2;
            result = (integers.get(index)+integers.get(index+1))/2.0;
        }else{
            result = integers.get(integers.size()/2)*1.0;
        }
        return result;
    }
}


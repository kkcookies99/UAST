  public int XXX(int[] height) {
        int maxmax = 0;
        // 为了防止重复，比如：自身和自身想对。所以i<数组的长度-1
        for(int i=0;i<height.length-1;i++){
            // j=i+1 而不是j=i,是为了防止重复，自身和自身想对
                for(int j = i+1;j<height.length;j++){
                    // 计算面积：宽度*较小一方的高度
                    int area = (j-i)*Math.min(height[i],height[j]);
                    // 比较面积：哪个大，选哪个
                    maxmax = Math.max(maxmax,area);
                }

        }
        return maxmax;


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



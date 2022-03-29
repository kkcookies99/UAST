 class Solution {
    public int XXX(String s) {
        char[] arr = s.toCharArray();
		Set<String> set = new HashSet<>();
		int num = 0;
		for(int i=0;i<arr.length;i++){
			boolean bol = set.add(String.valueOf(arr[i]));
			if(!bol){
				set.clear();
				i = s.lastIndexOf(arr[i],i-1);
			}
			if(num<set.size()){
				num = set.size();
			}
		}
        return num;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


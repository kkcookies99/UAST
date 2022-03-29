 public class Solution {
    public int LengthOfLongestSubstring(string s) {
        var ans=0;
        Dictionary<char,int> dic=new Dictionary<char,int>();
        var i=0;
        for(var j=0;j<s.Length;j++){
            if(dic.ContainsKey(s[j])){
                i=Math.Max(dic[s[j]],i);
            }
            ans=Math.Max(ans,j-i+1);
            dic[s[j]]=j+1;
        }
        return ans;
    }
}


 class Solution {
    public List<String> XXX(int n) {
        boolean [] flags = new boolean[n*2];
        List<String> ans = new ArrayList<>();
        generate(flags,ans,new StringBuilder());
        return ans;
    }

    public void generate(boolean [] flags, List<String> ans, StringBuilder sb){
        if (sb.length() == flags.length){
            ans.add(sb.toString());
            return;
        }
        if (!flags[sb.length()]){
            String parenthesize = sb.toString();
            int lLen = sb.length()-parenthesize.replaceAll("\\(","").length();
            int rLen = sb.length()-parenthesize.replaceAll("\\)","").length();
            if (lLen>flags.length/2 || rLen>=flags.length/2 || lLen<rLen){
                return;
            }
            if (lLen<flags.length/2){
                flags[sb.length()]=true;
                sb.append("(");
                generate(flags, ans, sb);
                flags[sb.length()-1]=false;
                sb.delete(sb.length()-1,sb.length());
            }
            if (lLen>rLen){
                flags[sb.length()]=true;
                sb.append(")");
                generate(flags, ans, sb);
                flags[sb.length()-1]=false;
                sb.delete(sb.length()-1,sb.length());
            }
        }
        return;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }



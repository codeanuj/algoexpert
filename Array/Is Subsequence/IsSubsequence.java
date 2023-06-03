class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;
        
        int subsequence = 0;
        
        for(int i=0; i<t.length(); i++){
            if(subsequence<s.length()){
                if(s.charAt(subsequence) == t.charAt(i))
                    subsequence++;
            }
        }
        return subsequence == s.length();
    }
}

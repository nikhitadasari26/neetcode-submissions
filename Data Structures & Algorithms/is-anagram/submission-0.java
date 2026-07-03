class Solution {
    public boolean isAnagram(String s, String t) {
        int sl =s.length();
        int tl = t.length();
        if(sl!=tl){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

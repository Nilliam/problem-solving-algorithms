class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String divisor = "";
        for (int i = 0; i < str1.length(); i++) {
            divisor += str1.charAt(i);
            if (str1.split(divisor).length == 0
                    && str2.split(divisor).length == 0) {
                return divisor;
            }
        }
        return "";
    }
}
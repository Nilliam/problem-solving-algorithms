class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder returnBuilder = new StringBuilder();
        int length = word1.length() + word2.length();
        for (int i = 0; i < length; i++) {
            if (i >= word1.length()) {
                returnBuilder.append(word2.substring(i));    
                break;
            }
            if (i >= word2.length()) {
                returnBuilder.append(word1.substring(i));    
                break;
            }
            
            returnBuilder.append(word1.charAt(i))
            .append(word2.charAt(i));
        }
        return returnBuilder.toString();
    }
}
class Solution {
    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for(int strIndex = 0; strIndex <=len; strIndex++){
            if(strIndex == len || chArray[strIndex] == ' '){
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex -1;
                while(startIndex < endIndex){
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(chArray);
        
        
    }
}

//https://leetcode.com/problems/reverse-words-in-a-string-iii/solutions/2339335/reverse-words-in-a-string-iii/

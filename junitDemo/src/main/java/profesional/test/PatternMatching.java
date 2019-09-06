package profesional.test;

public class PatternMatching {
    public static int matchPattern(int[] a,int[] pattern) {

        int i = 0; // index into a
        int k = 0; // index into pattern

        int matches = 0; // how many times current pattern character has been matched so far

        for (i = 0; i < a.length; i++) {
            if (a[i] == pattern[k])
                matches++; // current pattern character was matched
            else if (matches == 0 || k == pattern.length - 1 || a[i]>pattern[pattern.length-1])
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            else {//advance to next pattern character
                k++;
            }
        }

        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)

        if (i == a.length && k == pattern.length - 1) return 1;else return 0;
    }
    public static void main(String[]arg){
        //TEST
        PatternMatching.matchPattern(new int[]{1, 1, 1, 1, 1},new int[]{1});
        PatternMatching.matchPattern(new int[]{1},new int[]{1});
        PatternMatching.matchPattern(new int[]{1, 1,2,2,2,2},new int[]{1,2});
        PatternMatching.matchPattern(new int[]{1,2,3},new int[]{1,2});
        PatternMatching.matchPattern(new int[]{1, 2},new int[]{1,2,3});
        PatternMatching.matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3},new int[]{1, 3});
        PatternMatching.matchPattern(new int[]{1, 1, 1, 1},new int[]{1, 2});
        PatternMatching.matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3},new int[]{1, 2});
        PatternMatching.matchPattern(new int[]{1, 1, 10, 4, 4, 3},new int[]{1, 4, 3});
    }
}


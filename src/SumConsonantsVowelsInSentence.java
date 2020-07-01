public class SumConsonantsVowelsInSentence {

    public static void main(String[] args) {
        System.out.println(sentenceSum("Dealing with failure is easy: Work hard to improve. Success is also easy to handle: You’ve solved the wrong problem. Work hard to improve."));
    }

    private static int sentenceSum(String sent) {
        int res = 0;
        for (char ch : sent.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    res += ch * (-1);
                } else {
                    res += ch;
                }
            }
        }
        return res;
    }
}

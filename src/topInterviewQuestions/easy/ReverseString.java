package topInterviewQuestions.easy;

public class ReverseString {
  public String reverseString(String s) {
    int bound = (s.length() / 2);
    int lastIdx = s.length() - 1;
    
    char[] chars = s.toCharArray();
    for(int i = 0; i < bound; i++) {
      char tc = chars[i];
      chars[i] = chars[lastIdx - i];
      chars[lastIdx - i] = tc;
    }
    
    return String.valueOf(chars);
  }
}

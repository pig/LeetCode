package topInterviewQuestions.easy;

public class FirstUniqueCharacterInString {
  public int firstUniqChar(String s) {
    if(s == null) {
      return -1;
    }
    
    int index = s.length();
    for(int i = 0; i < s.length(); i++) {
      
      boolean repeat = false;
      for(int j = 0; j < s.length(); j++) {
        if((i != j) && s.charAt(i) == s.charAt(j)) {
          repeat = true;
          break;
        }
      }
      
      if(!repeat && i < index) {
        index = i;
        break;
      }
    }
    
    return (index == s.length()) ? -1 : index;
  }
}

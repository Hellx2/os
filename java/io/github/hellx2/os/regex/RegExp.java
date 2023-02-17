package io.github.hellx2.os.regex;

public class RegExp {
  private String pattern;
  
  public String getPattern() {
    return pattern;
  }
  
  public boolean matches(String x) {
    boolean lbs = false;
    boolean sb = false;
    int ptr = 0;
    for(String c : pattern.split("")) {
      if(c == "[") {
        if(lbs || sb) if(x.charAt(ptr++) != "[") return false;
        else sb = true;
      }
      if(c == "]") {
        if(lbs || !sb) if(x.charAt(ptr++) != "]") return false;
      }
      if(c == "\\")
        if(lbs) {
          lbs = false;
          if(x.charAt(ptr++) != "\\") return false;
        } else lbs = true;
    }
  }
}

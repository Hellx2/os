package io.github.hellx2.os;

import io.github.hellx2.os.RegExp;

public class Profile {
  private String name;
  private String displayname;
  
  public Profile(String name, String displayname) {
    this.name = name;
    this.displayname = displayname;
  }
  
  public Profile(String name) {
    this(name, name);
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) throws InvalidSequenceException {
    if(new RegExp("").matches(name)) throw new InvalidSequenceException();
  }
}

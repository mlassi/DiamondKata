package com.magnus;

public class Diamond {

  public String[] create(String[] letters) {
    StringBuilder sb = new StringBuilder();

    for (String letter : letters) {
      if ("A".equals(letter)) {
        sb.append("-A-");
        sb.append(System.lineSeparator());
      }
      if ("B".equals(letter)) {
        sb.append("B-B");
        sb.append(System.lineSeparator());
      }
    }

    return sb.toString().split(System.lineSeparator());
  }

}

package com.feefobackend;

import java.util.Arrays;
import java.util.List;

public class Normaliser {
  private final List<String> normalizedJobTitles = Arrays.asList("Architect", "Software engineer", "Quantity surveyor", "Accountant");
  // create a list of normalized job titles

  
  public String normalise(String jobTitle) {
    String[] words = jobTitle.toLowerCase().split(" ");
    String bestMatch = jobTitle;
    double bestQualityScore = 0.0;

    for (String normalizedJobTitle : normalizedJobTitles) {
      double qualityScore = 0.0;
      // For each normalized job title, 
      // we will calculate a quality score 
      // q which is the ratio of the number of words in the input string 
      // that are also in the normalized job title 
      // to the total number of words in the input str
      for (String word : words) {
        if (normalizedJobTitle.toLowerCase().contains(word)) {
          qualityScore += 1.0 / words.length;
        }
      }

      if (qualityScore > bestQualityScore) {
        bestQualityScore = qualityScore;
        bestMatch = normalizedJobTitle;
      }
    }

    return bestMatch;
  }
}

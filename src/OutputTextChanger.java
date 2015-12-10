
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc109
 */
public class OutputTextChanger {
    
    public String getFormattedText(String results) {
    List<String> resultsTokens = Arrays.asList(results.split(","));
    String helper = "";
    StringBuilder stringBuilder = new StringBuilder();
    String delimiter = "";
    for(String text : resultsTokens){
        stringBuilder.append(delimiter);
        stringBuilder.append(text);
        delimiter = "\n";
    }
    helper = stringBuilder.toString();
    helper = helper.replace("{", " ");
    helper = helper.replace("}", " ");
    return helper;
    }
}

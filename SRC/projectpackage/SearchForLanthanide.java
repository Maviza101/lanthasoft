package projectpackage;

import javax.swing.JOptionPane;

public class SearchForLanthanide {
    
    private static String searchFeedback;
    private static int firstTimeCounter=0;
    private static int continueOption=2;
 /*continueOption is used at the end of each query to determine whether the user wants to end all searches and go back to the article that
  was being viewed before the search began (continueOption=2), whether the user wishes to go to the lanthanide that the 
  last query yielded (continueOption=3) and whether the user wishes to conduct another query (continueOption=1).*/
    public static String searchEngine()
  {
      
      //give the user a welcome message to the search tool ONLY for the first time he/she uses the utility
      if (firstTimeCounter==0)
      {JOptionPane.showMessageDialog(null, "You are welcome to the search utility of Lanthasoft!");
      ++firstTimeCounter;
      }
      do  {
     String userQuery=JOptionPane.showInputDialog("Please enter the chemical symbol or atomic number of the lanthanide that you are looking for...");
    //then, carry out the search based on the user's input.
     switch (userQuery)
    {   
    case "La":
    case "la":
    case "LA":
    case "57":
        JOptionPane.showMessageDialog(null, "The element you are searching for is LANTHANUM, which has an atomic number of 57.");
        searchFeedback="La";
        break;
    case "Ce":
    case "ce":
    case "CE":
    case "58":
        JOptionPane.showMessageDialog(null, "The element you are searching for is CERIUM, which has an atomic number of 58.");
        searchFeedback="Ce";
        break;
    case "Pr":
    case "pr":
    case "PR":
    case "59":
        JOptionPane.showMessageDialog(null, "The element you are searching for is PRASEODYMIUM, which has an atomic number of 59.");
        searchFeedback="Pr";
        break;
    case "Ne":
    case "ne":
    case "NE":
    case "60":
        JOptionPane.showMessageDialog(null, "The element you are searching for is NEODYMIUM, which has an atomic number of 60.");
        searchFeedback="Ne";
        break;
    case "Pm":
    case "pm":
    case "PM":
    case "61":
        JOptionPane.showMessageDialog(null, "The element you are searching for is PROMETHIUM, which has an atomic number of 61.");
        searchFeedback="Pm";
        break;
    case "Sm":
    case "sm":
    case "SM":
    case "62":
        JOptionPane.showMessageDialog(null, "The element you are searching for is SAMARIUM, which has an atomic number of 62.");
        searchFeedback="Sm";
        break;
    case "Eu":
    case "eu":
    case "EU":
    case "63":
        JOptionPane.showMessageDialog(null, "The element you are searching for is EUROPIUM, which has an atomic number of 63.");
        searchFeedback="Eu";
        break;
    case "Gd":
    case "gd":
    case "GD":
    case "64":
        JOptionPane.showMessageDialog(null, "The element you are searching for is GADOLINIUM, which has an atomic number of 64.");
        searchFeedback="Gd";
        break;
    case "Tb":
    case "tb":
    case "TB":
    case "65":
        JOptionPane.showMessageDialog(null, "The element you are searching for is TERBIUM, which has an atomic number of 65.");
        searchFeedback="Tb";
        break;
    case "Dy":
    case "dy":
    case "DY":
    case "66":
        JOptionPane.showMessageDialog(null, "The element you are searching for is DYSPROSIUM, which has an atomic number of 66.");
        searchFeedback="Dy";
        break;
    case "Ho":
    case "ho":
    case "HO":
    case "67":
        JOptionPane.showMessageDialog(null, "The element you are searching for is HOLMIUM, which has an atomic number of 67.");
        searchFeedback="Ho";
        break;
    case "Er":
    case "er":
    case "ER":
    case "68":
        JOptionPane.showMessageDialog(null, "The element you are searching for is ERBIUM, which has an atomic number of 68.");
        searchFeedback="Er";
        break;
    case "Th":
    case "th":
    case "TH":
    case "69":
        JOptionPane.showMessageDialog(null, "The element you are searching for is THULIUM, which has an atomic number of 69.");
        searchFeedback="Th";
        break;
    case "Yb":
    case "yb":
    case "YB":
    case "70":
        JOptionPane.showMessageDialog(null, "The element you are searching for is YTTERBIUM, which has an atomic number of 70.");
        searchFeedback="Yb";
        break;
    case "Lu":
    case "lu":
    case "LU":
    case "71":
        JOptionPane.showMessageDialog(null, "The element you are searching for is LUTETIUM, which has an atomic number of 71.");
        searchFeedback="Lu";
        break;
    default:
        JOptionPane.showMessageDialog(null, "The input you supplied does not correspond to any lanthanide. Please try again.");
        searchFeedback="Error";
        
    }//end of switch
     String input=JOptionPane.showInputDialog(null, "Please choose what next you wish to do from the options below:"
             + "\n\n1. In order to conduct another search, enter 1."
             + "\n2. In order to go to the article you were reading before you started your enquiry, enter 2."
             + "\n3. In order to go to the articles about the lanthanide from your last search, please enter 3.", "WHAT DO YOU WISH TO DO?", JOptionPane.QUESTION_MESSAGE);
     continueOption=Integer.parseInt(input);
      } while (continueOption==1);
    if (continueOption==2)
    {return searchFeedback="Error";}
    else
        return searchFeedback;
}

}

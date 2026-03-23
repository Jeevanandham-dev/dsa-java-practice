import java.util.*;

public class CountOfItemsMatchingaRule {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the List elements in the form of 2d array: ");
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
             List<String> row = new ArrayList<>();
            for(int j=0;j<3;j++){
            String rowE = obj.nextLine();
            row.add(rowE);
            }
            list.add(row);
        }
        System.out.println("Enter ruleKey: ");
        String ruleKey = obj.nextLine();
        System.out.println("Enter ruleValue: ");
        String ruleValue = obj.nextLine();
        obj.close();

        System.out.println(countMatches(list,ruleKey,ruleValue));

        
    }


    
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int j=0;
        if(ruleKey.equals("type"))
        j=0;
        else if(ruleKey.equals("color"))
        j=1;
        else if(ruleKey.equals("name"))
        j=2;

        for(int i=0;i<items.size();i++){
            if(items.get(i).get(j).equals(ruleValue))
                count++;
        }
        return count;
    }
}


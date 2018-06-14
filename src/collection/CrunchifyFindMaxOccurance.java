package collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
 
public class CrunchifyFindMaxOccurance {
 
    /**
     * @author Crunchify.com
     */
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
 
        File file = new File("D:\\key\\temp.txt");
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine = null;
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
 
        try {
            while ((inputLine = bufferedReader.readLine()) != null) {
            String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");
 
                for (int counter = 0; counter < words.length; counter++) {
                    String key = words[counter].toLowerCase(); // remove .toLowerCase for Case Sensitive result.
                    if (key.length() > 0) {
                        if (map.get(key) == null) {
                            map.put(key, 1);
                        }
                        else {
                            int value = map.get(key).intValue();
                            value++;
                            map.put(key, value);
                        }
                    }
                 }
            }
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            System.out.println("Words" + "  " + "# of Occurances");
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + " =" + entry.getValue());
            }
            System.out.println("\nMaixmum Occurance of Word in file: " + getLastElement(entrySet));
 
        }
 
        catch (IOException error) {
            System.out.println("Invalid File");  
        }
        finally {
            bufferedReader.close();
        }
 
    }
    static Object getLastElement(final Collection<Entry<String, Integer>> c) {
        final Iterator<Entry<String, Integer>> itr = c.iterator();
        Object lastElement = itr.next();
        while(itr.hasNext()) {
            lastElement=itr.next();
        }
        return lastElement;
    }
}
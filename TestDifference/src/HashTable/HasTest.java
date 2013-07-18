/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.Hashtable;

/**
 *
 * @author Manjeet Singh
 */
public class HasTest {
        public static void main(String[] args)
{
    Hashtable ht=new Hashtable();
    ht.put("ONE","one-one");
    ht.put("TWO","two-two");
    ht.put("THREE","0.123");
    ht.put("FOUR","111.23");
    ht.put("FIVE","0.0");
    String one="0.0";
    String two="0.0";
    String three="0.0";
    
    if(ht.size()>0)
    {
        one=(String)ht.get("THREE");
        two=(String)ht.get("FOUR");
        three=(String)ht.get("FIVE");
        System.out.println(ht.get("ONE"));
        System.out.println(ht.get("TWO"));
        System.out.println(Double.parseDouble(one)+"\n"+Double.parseDouble(two)+"\n"+Double.parseDouble(three));
    }
}
}

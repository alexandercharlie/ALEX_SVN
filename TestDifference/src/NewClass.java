
import java.io.IOException;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
class DoWhileDemo {
    public static void main(String[] args) throws IOException{
   String ss="";
        String s="INV0001962,INV0001914,INV0001915,INV0001960,INV0001929,INV0001964,INV0001963,INV0001913,INV0001894,INV0001918,INV0001961,INV0001958,INV0001957,INV0001886,INV0001921,INV0001922,INV0001956,INV0001959";
   ss=s.replaceAll(",",", ");
   //System.out.println(ss);
   String s1[]={"INV0001962","INV0001914","INV0001915","INV0001960","INV0001929","INV0001964","INV0001963","INV0001913","INV0001894","INV0001918","INV0001961","INV0001958","INV0001957","INV0001886","INV0001921","INV0001922","INV0001956","INV0001959"};
   Vector v=new Vector();
   String s2[]={"INV0001962", "INV0001914", "INV0001960", "INV0001959", "INV0001963", "INV0001921"};// INV0001958, INV0001918, INV0001961, INV0001957, INV0001913, INV0001964, INV0001915""
   
   String sr="INV0001962, INV0001914, INV0001960, INV0001959, INV0001963, INV0001921, INV0001958, INV0001918, INV0001961, INV0001957, INV0001913, INV0001964, INV0001915";
  String arr[]=sr.split(",");
  //System.out.println(arr);
   for(int i=0;i<arr.length;i++)
   {
       //System.out.println(arr[i]);
       //System.out.println(s1[i]);
     //v.addElement(s1[i]);
     //System.out.println(v.elementAt(i));//
   }
   String su="SUCCESS: Payment Processed Successfully";
   String er=": Payment has been aborted";
   
//   if(su.indexOf("SUCCESS")!=-1)
//   {
//       System.out.println(su);
//   }
//   if(er.indexOf("ERROR")!=-1)
//   {
//       System.out.println(er);
//              
//   }
   
   String test="Payment is Being Processed...\nWARNING:Your Secondary Check Limit has been exhausted\n"
           + "Consider Upgrading it\nSUCCESS: Payment Processed Successfully";
  // System.out.println(test.replaceAll("\\n","%n"));
   String ship="Quantity";
   if(ship.indexOf("Ship")!=-1)
       System.out.println(ship);
    }
}
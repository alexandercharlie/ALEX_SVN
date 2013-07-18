/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
public class Tester {
 public static void main(String[] args)
 {
            String sourceFile="C:\\folder1\\file1.txt";
            System.out.println(sourceFile.length()+2);
            String file = sourceFile.substring(sourceFile.lastIndexOf('/')+1, sourceFile.lastIndexOf('.'));
            String fileNameWithoutExtn = sourceFile.substring(0, sourceFile.lastIndexOf('.'));
            String fileN1=sourceFile.substring(sourceFile.lastIndexOf('/')+1,20);
            System.out.println(file+"\n"+fileNameWithoutExtn+"\n"+fileN1);
            
            
//            int slashIndex = sourceFile.lastIndexOf('/');
//int dotIndex = sourceFile.lastIndexOf('.', slashIndex);
//String filenameWithoutExtension;
//if (dotIndex == -1)
//{
//  filenameWithoutExtension = sourceFile.substring(slashIndex + 1);
//  System.out.println("1="+filenameWithoutExtension);
//}
//else
//{
//  filenameWithoutExtension = sourceFile.substring(slashIndex + 1, dotIndex);
//System.out.println("2="+filenameWithoutExtension);
//}
 }
}

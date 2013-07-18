/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
public class Atest {

    public static void main(String[] args) {
    Atest x=new Atest();
    x=null;
    try{
    System.out.println(x.sum(12, 23));
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    x=new Atest();
    System.out.println(x.sum(12, 45));
    }
private int sum(int x,int y)
{
    return x+y;
}
}

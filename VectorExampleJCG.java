
import java.util.ArrayList;
import java.util.Vector;
public class VectorExampleJCG {
    public static void main(String[] args) {
        // create default vector
        Vector v = new Vector();
        v.add(111);
        v.add(2);
        v.add("java");
        v.add("code");
        v.add("geeks");
        v.add(4546);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(0);
        System.out.println("Vector is " + v);


//Adding element in postion 2
        v.add(2, "3 ");
        System.out.println("Vector after adding element in position 2 is " + v);

        // Add element method
        v.addElement("7");
        v.addElement("8");
        v.addElement("9");
        v.addElement("10");
        System.out.println("Vector with addElement method is " + v);


        //vector with capacity
        Vector v1 = new Vector(2);
        v1.add("vector");
        v1.add("with");
        v1.add("capacity");
        System.out.println("Vector is " + v1);

        //vector with capacity and increment value
        Vector v2 = new Vector(2,3);
        v2.add("capacity vector");
        v2.add("and ");
        v2.add("increment");
        System.out.println("Vector is " + v2);

        //vector with collection
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Vector v3 = new Vector (arr);
        System.out.println("Vector is " + v3);




        Object  obj = v.get(3);
        System.out.println("3rd element of Vector is "+obj);
        Object obj2 = v.elementAt(5);
        System.out.println("5th element of Vector is "+obj2);
        Object obj3 = v.firstElement();
        System.out.println("1st element of Vector is "+obj3);

        //removal of element java using remove method from vector v
        v.remove("java");
        System.out.println("Vector after removing 'java' is "+ v);
        // removal of 7 using removeElement
        v.removeElement(7);
        System.out.println("Vector after removing 7 is "+ v);
        //removal of element from index i.e removing element of index 0
        v.remove(0);
        System.out.println("Removing element of index 0 " + v);
        //Removing element at index 5 by using removeElementAt method
        v.removeElementAt(5);
        System.out.println("Vector after removing element at index 5 is "+ v);
        //Using removeAllElements method
        v.removeAllElements();
        System.out.println("Vector after removing all elements is "+ v);

    }
}


import java.lang.*;
import java.util.*;

class Demo {
    public void fun(int index) throws ArrayIndexOutOfBoundsException {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println("Element of array is" + arr[index]);
    }

}

class Checked {
    public static void main(String arrg[]) {
        Scanner sobj =new Scanner(System.in);

        System.out.println("Inside main");
        System.out.println("Enter array Index");
        int Index = sobj.nextInt();

        Demo obj = new Demo();

        try {
            obj.fun(Index);
        } catch (ArrayIndexOutOfBoundsException ref) {
            System.out.println("Inside catch");
        }

    }
}
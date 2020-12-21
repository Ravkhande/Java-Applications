
import java.lang.*;

interface Demo<T> {
    T fun(T no1);

    T gun(T no2);
}

class Hello<T> implements Demo<T> {
    public T fun(T no1) {

        return no1;
    }

    public T gun(T no2) {

        return no2;
    }
}

class Ginterface {

    public static void main(String args[]) {

        Hello<Integer> iobj = new Hello<Integer>();
        Hello<Float> sobj = new Hello<Float>();

        Integer iret = iobj.fun(11);
        Float sret = sobj.gun(22.3f);

        System.out.println(iret);
        System.out.println(sret);

    }

}
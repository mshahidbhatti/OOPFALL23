package week06_a;

public class Demo {
    public static void main(String[] args) {

        D objd=new D();
        objd.someMethod();
        A objd2=new B();

        A list[]=new A[10];
        list[0]=new D();
        list[1]=new C();
        list[2]=new B();

        if(list[0] instanceof  A)
            System.out.println();
        objd2.someMethod();
        A obj3=new D();
        obj3.someMethod();

//        A obj=new A();
//        System.out.println(obj.x);
//        B obj1=new B();
//        System.out.println(obj1.x);
//        A obj2=new B();
//        obj2.someMethod();
//       // System.out.println(((B)obj2).z);
//        System.out.println(" parent reference"+obj2.x);
//        A obj4=new C();
//        System.out.println(obj4.x);
//
//        System.out.println(B.y);
//        System.out.println(A.y);
//        System.out.println(obj1.y);
//        System.out.println(obj.y);
//        System.out.println(obj2.y);


//        obj.someMethod();

    }
}

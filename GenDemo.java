class Gen<T, U, V>{
    T a;
    U b;
    V c;

    Gen(T a, U b, V c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    T getob1(){
        return a;
    }

    U getob2(){
        return b;
    }

    V getob3(){
        return c;
    }

    void showType(){
        System.out.println("Object 1: " + a.getClass().getName());
        System.out.println("Object 2: " + b.getClass().getName());
        System.out.println("Object 3: " + c.getClass().getName());
    }

}

class GenDemo{
    public static void main(String args[]){

        Gen<Integer, String, Double> genOb = new Gen<>(55, "BMS", 3.14);
        System.out.println("Object 1: " + genOb.getob1());
        System.out.println("Object 2: " + genOb.getob2());
        System.out.println("Object 3: " + genOb.getob3());

        genOb.showType();

    }
}

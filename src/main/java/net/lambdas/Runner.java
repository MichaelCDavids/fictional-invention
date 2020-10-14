package net.lambdas;


interface Runner {
    public void run();
}
 class LambdaLesson {

    public static void main(String[] args) {
        run(() -> voidMethod()); //will invoke run(Runner ) method.
        run(() -> intMethod());//will also invoke run(Runner ) method.
    }

    public static void run(Runner x) {
        x.run();
    }

    public static void voidMethod() {
        System.out.println("voidMethod");
    }
    public static int intMethod() {
        System.out.println("intMethod");
        return 0;
    }
}

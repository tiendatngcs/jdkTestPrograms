import java.util.*;



class Simple {
    


    public static void do_job(String subject, String operation) {
        switch (subject){
            case "do_nothing":
                System.out.println("Doing nothing");
                int a = 0;
                a = 1;
                break;
            
            case "object":
                System.out.format("Doing %s %s\n", subject, operation);
                A object_instance = new A();
                switch (operation) {
                    case "read":
                        int value = object_instance.val + 9;
                        break;
                    case "write":
                        object_instance.val = 1;
                        break;
                    case "copy":
                        A copy_instance = new A(object_instance);
                        break;
                }
                break;

            case "array":
                System.out.format("Doing %s %s\n", subject, operation);
                int[] int_arr_a = new int[10];
                int[] int_arr_b = new int[10];
                switch (operation) {
                    case "read":
                        int value = int_arr_a[9] + 9;
                        break;
                    case "write":
                        int_arr_a[9] = 9;
                        break;
                    case "copy":
                        System.arraycopy(int_arr_a, 0, int_arr_b, 0, 3);
                        System.arraycopy(int_arr_b, 0, int_arr_a, 0, 3);
                        break;
                }
                break;
        }
    }
    public static void main (String args[]){

        String[] subjects = {"do_nothing", "object", "array"};
        String[] operations = {"read", "write", "copy"};
        if (args.length == 0) {
            System.out.println("Please choose testing subject and operation");
            System.out.println("java ./test.java <subject> <operation>");
            System.out.println("Subjects:");
            for (String s: subjects) {
                System.out.println("\t"+s);
            }

            System.out.println("Operations:");
            for (String s: operations) {
                System.out.println("\t"+s);
            }
            System.exit(0);
        } else {
            String subject = args[0];
            String operation = args[1];
            while (true){
                do_job(subject, operation);
                try {
                    Thread.sleep(500);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class A {
    int val = 0;
    public A () {
        this.val = 0;
    }
    public A(A a) {
        this.val = a.val;
    }
}
public class Loops {
    public static void main(String[] args) {
        
        //Printing same output from 0-9
        
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }

        int i=0;

        while(i<10) {
            System.out.println(i);
            i++;
        }

        i=0;
        do {
            System.out.println(i);
            i++;
        } while(i<10);
    }
}

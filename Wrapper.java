
class Wrapper {
    public static void main(String[] args) {

        double d = 1.234;   //variable

        String str = "1234";    //string datatype

        Integer i = 10;     //object of Integer wrapper class

        int n = (int) d;      //type-casting

        int nstr = Integer.parseInt(str);       //type-parsing
        double nstrd = Double.parseDouble(str);

        System.out.println(n);
        System.out.println(nstrd);
        System.out.println(Integer.toString(nstr));
        System.out.println(Integer.valueOf(nstr));
        System.out.println(Integer.reverse(nstr));
    }
}
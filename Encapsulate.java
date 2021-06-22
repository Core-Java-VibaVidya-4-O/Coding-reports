
class TestEncapsulation {
    private String empName;
    private int empId;

    public String getEmpName() {
        return this.empName;
    }                           //getters

    public void setEmpName(String empName) {
        this.empName = empName;
    }                           //setters

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //encapsulated class
}

public class Encapsulate {
    public static void main(String[] args) {
        
        TestEncapsulation encap = new TestEncapsulation();

        encap.setEmpId(101);
        encap.setEmpName("Karthick");

        System.out.println(encap.getEmpId());
    
        System.out.println(encap.getEmpName());
    }
}

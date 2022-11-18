package org.emp;

public class Employee {
private void empId(byte b) {
	System.out.println(b);
	
}
private void empId( short s) {
	System.out.println(s);

}
private void empId(int i) {
	System.out.println(i);

}
private void empId( long l ) {
	System.out.println(l);

}
private void empId(float f) {
	System.out.println(f);
	

}
private void empId(double d) {
	System.out.println(d);

}
private void empId(char c) {
	System.out.println(c);

}
private void empId(String s) {
	System.out.println(s);

}
public static void main(String[] args) {
	

Employee e=new Employee();
e.empId(12);
e.empId(1234);
e.empId(567845367);
e.empId(5678976533l);
e.empId(345567.675433);
e.empId(45.555555);
e.empId('m');
e.empId("sharmi");


}
}

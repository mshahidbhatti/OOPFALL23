package week05_b;

public class Employee extends Person{
  String ssn;
  double basicSalaray;
// public Person(String name, String email, String address) {
Employee(String name, String email, String address,String ssn,double basicSalaray){

  super(name, email, address);
  this.ssn=ssn;
  this.basicSalaray=basicSalaray;

}

  public double calSalary(){
    return basicSalaray;
  }




}

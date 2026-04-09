// overriding equals, toString and hashCode method in java
class Student{
    int id;
    String name;
    Student(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public int hashCode()
    {
        return id;
    }
    public String toString()
    {
        String str = "The Id is: "+id+" and the name is: "+name;
        return str;
    }
    public boolean equals(Object obj)
    {
        // if(this == obj)
        //  return true;
         System.out.println("Check");
        Student s = (Student)obj;
        return(this.id == s.id && this.name.equals(s.name)); // s1.id == s2.id && s1.name.equals(s2.name)  // it is checking the value of id and name of both the objects. if both are same then it will return true otherwise false.
    }
}
 class OverridingEquals {
    public static void main(String[] args) {
        Student s1 = new Student(106, "Rahul Kumar");
        Student s2 = new Student(106, "Rahul Kumar");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
    }
}


/*if we does not override the equals method then it will check the reference of both the objects
 and it will return false because both the objects are different. but if we override the equals
  method then it will check the value of id and name of both the objects. if both are same then 
  it will return true otherwise false.

if we does not override the hashCode method then it will return the reference of the object in 
 the form of integer. but if we override the hashCode method then it will return the value of id 
 of the object because we are returning id in the hashCode method.

if we does not override the toString method then it will return the reference of the object in 
the form of string. but if we override the toString method then it will return the string 
which we are returning in the toString method. in this case it will return "The Id is: 106 
and the name is: Rahul Kumar" because we are returning this string in the toString method.

*/
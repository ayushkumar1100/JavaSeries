// Anonymous Class in Java with separate class for main method
interface MyInterface {
    void show();
}

class ConceptAnonymous 
{
       MyInterface obj = new MyInterface() 
        {
            public void show() {
                System.out.println("Hello World");
            }
        };
        void display() 
        {
        obj.show(); 
        }
}
class AnonymousWithMain {
    public static void main(String[] args) {
        ConceptAnonymous  obj = new ConceptAnonymous();
       
        // obj.show(); // this will give error because show() is not defined in ConceptAnonymous class. it is defined in anonymous class which is created inside ConceptAnonymous class. so we cannot call show() method directly using obj reference variable. we need to create an object of anonymous class and then call show() method using that object reference variable.
        
         obj.obj.show(); // this will work because obj is reference variable of MyInterface type which is implemented by anonymous class. so we can call show() method using obj reference variable.

         obj.display(); // this will work because display() method is defined in ConceptAnonymous class and it is calling show() method using obj reference variable which is of MyInterface type and implemented by anonymous class. so it will call show() method of anonymous class and print "Hello World".


    }
}
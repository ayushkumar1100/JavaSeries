class LocalVar 
{
    int x = 10;         
    static int y = 20;  
    void display() {

        int x = 30;      
        int y = 40;     

        System.out.println("Local x = " + x);
        System.out.println("Instance x = " + this.x); // using object

        System.out.println("Local y = " + y);
        System.out.println("Static y = " + LocalVar.y); // using class name
    }

    // we can also directly write main in the class
    public static void main(String[] args) 
    {
        LocalVar obj = new LocalVar();
        obj.display();
    }
}

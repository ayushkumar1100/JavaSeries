class StaticVsNonStatic{
    int count = 0;
    static int staticCount=0 ;
    void nonStaticDemo(){
        count = 0;  
        count++;
        System.out.println("Non-static count: " + count);
    }
    static void staticDemo(){
        staticCount++;
        System.out.println("Static count: " + staticCount);
    }
    public static void main(String[] args){
        StaticVsNonStatic obj = new StaticVsNonStatic();
        System.out.println("Calling non-static method:");
        obj.nonStaticDemo();
        obj.nonStaticDemo();
        obj.nonStaticDemo();
        System.out.println("\nCalling static method:");
        StaticVsNonStatic.staticDemo();
        StaticVsNonStatic.staticDemo();
        StaticVsNonStatic.staticDemo();
    }
}

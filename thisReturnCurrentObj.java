class Sample {
    Sample getObject() {
        return this; // equivalent to return s; where s is the current object of class Sample.
    }
    void message() {
        System.out.println("Hello Java");
    }
}
class thisReturnCurrentObj {
    public static void main(String[] args) {
        Sample s = new Sample();
        Sample temp = s.getObject();
        temp.message();    
    }
}
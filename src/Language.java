abstract class Language {
    Language(){
        System.out.println("Python Programming");
    }
    abstract void programming();
    void branching(){
        System.out.println("Conditional");
    }
}
class Java extends Language{
    @Override
    void programming(){
        System.out.println("Java Programming");
    }
}
class test2{
    public static void main(String[] args) {
        Language l = new Java();
        l.branching();
        l.programming();
    }
}
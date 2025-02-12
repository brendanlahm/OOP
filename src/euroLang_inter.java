abstract class euroLang_inter { //Interface
    public abstract void branch(); //Interface Method -> Inherited by child class
}

class Spanish1 extends euroLang_inter { //Child Class
    String name = "Spanish";
    public void branch() {
        System.out.println(name + " is in the Romance branch");
    }
}

class Hindi1 extends euroLang_inter { //Child Class
    String name = "Hindi";
    public void branch() {
        System.out.println(name + " is in the Indic branch");
    }
}

class Main1 {
    public static void main(String[] args) {
        Spanish1 SpanishObj = new Spanish1(); // Constructor for Spanish
        Hindi1 HindiObj = new Hindi1(); // Constructor for Hindi
        //Spanish info
        SpanishObj.branch();
        // Hindi info
        HindiObj.branch();
    }
}



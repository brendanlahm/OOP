class euroLang { //Parent Class
    protected String family = "Indo-Euro"; //Inherited to child class via 'protected'
}

class Spanish extends euroLang { //Child Class
    String name = "Spanish";
    String branch = "Romance";
}

class Hindi extends euroLang { //Child Class
    String name = "Hindi";
    String branch = "Indic";
}

class Main {
    public static void main(String[] args) {
        euroLang LangObj = new euroLang(); //Constructor for Parent Class
        Spanish SpanishObj = new Spanish(); // Constructor for Spanish
        Hindi HindiObj = new Hindi(); // Constructor for Hindi
        //Spanish info
        System.out.println(SpanishObj.name + " is in the " + LangObj.family + " family");
        System.out.println("The sub-family is " + SpanishObj.branch);
        // Hindi info
        System.out.println(HindiObj.name + " is in the " + LangObj.family + " family");
        System.out.println("The sub-family is " + HindiObj.branch);
    }
}



class euroLang { //Parent Class

    protected String family = "Indo-Euro"; //Inherited to child class via 'protected'

}

class Spanish extends euroLang {

    String name = "Spanish";
    String sub_family = "Romance";

    public static void main(String[] args) {
        Spanish LangObj = new Spanish(); //Constructor
        System.out.println(LangObj.name + " is in the " + LangObj.family + " family");
        System.out.println("The sub-family is " + LangObj.sub_family);
    }

}



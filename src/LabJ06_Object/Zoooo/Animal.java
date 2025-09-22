package LabJ06_Object.Zoooo;

public class Animal {
    public String name;
    public String category;
    public String whatItSay;

    public Animal(String name, String category) {
        this.name = name;
        this.category = category;

        if (category.equals("cat")) {
            this.whatItSay = "Meow";
        } else if (category.equals("dog")) {
            this.whatItSay = "Woof-woof";
        } else if (category.equals("bird")) {
            this.whatItSay = "Cheep";
        } else{
            this.whatItSay = "";
        }
    }


    public void saySomething() {
        System.out.println(name + ": " + whatItSay);
    }

}

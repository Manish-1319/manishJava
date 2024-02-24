public class ClassNObject {
    public static void main(String[] args) {

        Pen p1 = new Pen();    //Create an object
        p1.setColor("Blue");
            System.out.println(p1.color);
        p1.setTip(5);
            System.out.println(p1.tip);
        p1.setColor("Yellow");
            System.out.println(p1.color);
        p1.color="Red";
            System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Manish";
            System.out.println(myAcc.username);
        // myAcc.password = 1234;  //ERROR: The field BankAccount.password is not visible()
        myAcc.setPassword(1234);    

        Pencil pc1 = new Pencil();
        pc1.setColor("Blue");
            System.out.println(pc1.getColor());
        pc1.setTip(5);
            System.out.println(pc1.getTip());
        pc1.setColor("Red");
            System.out.println(pc1.getColor());
    }
}

//Create a class
class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

//Access Modifiers
class BankAccount {
    public String username;    //We can access username outside class
    private int password;   //We can't access password outside class

    public void setPassword(int newPassword){   //We can access setPassword() outside class   
        password = newPassword;
    }
}     

//Getter & Setter
class Pencil {
    private String color;
    private int tip;

    String getColor() {
        return this.color;  // "this" keyword is used to refer to the current "object".
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

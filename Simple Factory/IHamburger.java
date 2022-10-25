
public abstract class IHamburger {
    String name;
    public void prepare(){
        System.out.println(this.name+"Burger is preparing...");
    }
    public void cook(){
        System.out.println(this.name+"Burger is cooking...");
    }
    public void box(){
        System.out.println(this.name+"Burger is boxing...");
    }

}

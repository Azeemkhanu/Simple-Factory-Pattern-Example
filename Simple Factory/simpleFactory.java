public class simpleFactory{
    public static void main(String[] args) {
        SimpleHamburgerFactory factory =new SimpleHamburgerFactory();
        IHamburger hamburger= factory.createHamburger("cheese");
        hamburger.name="cheese"; 

        hamburger.prepare();

        
    }
}
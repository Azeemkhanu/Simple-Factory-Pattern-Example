
public class SimpleHamburgerFactory {

    IHamburger burger;
    
    public IHamburger createHamburger(String type){

        IHamburger burger=null;

        if(type.equals("cheese"))
        {
            burger=new CheezBurger();
        }else if(type.equals("veggie"))
        {
            burger=new VeggieBurger();
        }
        return burger;


    }

}

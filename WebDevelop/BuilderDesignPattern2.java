package Design_pattern.Creational;

class Burger {
    private String bread;
    private String patty;
    private String veggies;
    private String sauces;
    private Boolean withExtraCheese = Boolean.FALSE;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getPatty() {
        return patty;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public Boolean getWithExtraCheese() {
        return withExtraCheese;
    }

    public void setWithExtraCheese(Boolean withExtraCheese) {
        this.withExtraCheese = withExtraCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bread='" + bread + '\'' +
                ", patty='" + patty + '\'' +
                ", veggies='" + veggies + '\'' +
                ", sauces='" + sauces + '\'' +
                ", withExtraCheese=" + withExtraCheese +
                '}';
    }
}

class BurgerBuilder {
    private Burger burger;

    public BurgerBuilder () { this.burger = new Burger(); }
    public void addBread(String bread) { burger.setBread(bread); }
    public void addPatty(String patty ) { burger.setPatty(patty); }
    public void addVeggies(String veggies ) { burger.setVeggies(veggies ); }
    public void addSauce(String sauce) { burger.setSauces(sauce); }
    public void addCheese() { burger.setWithExtraCheese(Boolean.TRUE); }
    public Burger build() { return this.burger; }
}
public class BuilderDesignPattern2 {
    public static void main(String[] args) {
        BurgerBuilder b=new BurgerBuilder();
        b.addBread("Brown Bread");
        b.addPatty("Veggies");
        b.addVeggies("Pickles");
        b.addSauce("All");
        b.addCheese();
        Burger vegBurger=b.build();
        System.out.println(vegBurger);

    }
}

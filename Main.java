public class Main {
    private Upgrade upgrade;

    public Upgrade getUpgrade() {
        return this.upgrade;
    }

    public void doUpgrade(String specialistName){
        this.upgrade = new Upgrade();
        Specialist sp = new Specialist();

        
        Item efeder = new Item();
        Item volli = new Item();
        Item niedrigeSchutzr = new Item();
        Item hoheSchutzr = new Item();
        Item grüneSeele = new Item();
        Item roteSeele = new Item();
        Item blaueSeele = new Item();
        Item drachenhaut = new Item();
        Item drachenblut = new Item();
        Item drachenherz = new Item();
        Item gold = new Item();

        sp.setName(specialistName).setCurrentUpgrade(0);

        efeder.setName("Engelsfeder").setPrice(0).setQuantity(0);
        volli.setName("Vollmondkristall").setPrice(0).setQuantity(0);
        niedrigeSchutzr.setName("niedrige SP-Schutzrolle").setPrice(0).setQuantity(0);
        hoheSchutzr.setName("hohe SP-Schutzrolle").setPrice(0).setQuantity(0);
        grüneSeele.setName("glänzende grüne Seele").setPrice(0).setQuantity(0);
        roteSeele.setName("glänzende rote Seele").setPrice(0).setQuantity(0);
        blaueSeele.setName("glänzende blaue Seele").setPrice(0).setQuantity(0);
        drachenhaut.setName("Drachenhaut").setPrice(0).setQuantity(0);
        drachenblut.setName("Drachenblut").setPrice(0).setQuantity(0);
        drachenherz.setName("Drachenherz").setPrice(0).setQuantity(0);
        gold.setName("Gold").setPrice(0).setQuantity(0);
        
    }






    public static void main(String[] args) {
        
    }
}

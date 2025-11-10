public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historia;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.historia = new ChangeHistory();
        super.addToWarehouse(initialBalance); // this now works because it's overridden correctly below
        historia.add(getBalance());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        historia.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        historia.add(getBalance());
        return taken;
    }

    public String history() {
        return historia.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName()+"\n"
        +"History: "+ history()+"\n"
        +"Largest amount of product: "+historia.maxValue()+"\n"
        +"Smallest amount of product: "+historia.minValue()+"\n"
        +"Average: "+historia.average());
    }
}

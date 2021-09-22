package ru.mirea.task5.ms;

public class FurnitureShop{
    public String price;
    public int amount;

    public FurnitureShop(String Type, String price, int amount){
        if (Type == "Table"){
            Table t1 = new Table("wood", "black", 100,150,75);
            this.price = price;
            this. amount = amount;
            System.out.print(t1.toString());
        }
        else{
            chair c1 = new chair("plactic", "green", 40,40,50);
            this.price = price;
            this. amount = amount;
            System.out.print(c1.toString());
        }
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "" +
                "price='" + price + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        FurnitureShop obj1 = new FurnitureShop("Table", "245$", 2);
        System.out.print(obj1.toString());
        System.out.println();
        FurnitureShop obj2 = new FurnitureShop("Chair", "75$", 6);
        System.out.print(obj2.toString());
    }
}

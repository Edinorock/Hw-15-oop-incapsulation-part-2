public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.lifeSpan = 1;
        Flower hypsofila = new Flower(null, "Турция", 19.5);
        hypsofila.lifeSpan = 10;

        printInfo(rosa);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(hypsofila);

        System.out.println( );
        printCostOfFlower(
                rosa, rosa, rosa,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hypsofila);
    }

    private static void printInfo(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() + ", cтрана: " + flower.getCountry() + ", стоимость за штуку: " + flower.getCost() + ", срок стояния цветка: " + flower.lifeSpan);
    }


    private static void printCostOfFlower(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if(flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета " + totalCost);
        System.out.println("Срок стояния букета " + minimumLifeSpan);


    }

}


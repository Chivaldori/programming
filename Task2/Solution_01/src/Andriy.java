import java.util.ArrayList;

public class Andriy extends Human{

	Car lanos, leksus;
    Aquarium aquarium;
	
	public Andriy(){
		lanos = new Car("lanos");
		leksus = new Car("leksus");

        aquarium = new Aquarium();
        aquarium.fishes.add(new Fish("Барбус", 2));
        aquarium.fishes.add(new Fish("Скалярия", 3));
        aquarium.fishes.add(new Fish("Сомик", 1));

	}

    public void feedFishes() {
    }

    public void drive(Car carToDrive) {
    }


}


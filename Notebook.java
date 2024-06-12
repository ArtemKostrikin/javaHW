import java.util.ArrayList;
import java.util.List;

class Notebook {
    private String name;
    private String ram;
    private int price;

    public Notebook(String name, String ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Asus", "2ГБ", 4666));
        notebooks.add(new Notebook("HP", "4ГБ", 6600));
        notebooks.add(new Notebook("MSI", "6ГБ", 5555));

        // Вместо вывода данных просто пример
        System.out.println("Notebooks: " + notebooks);
    }
}

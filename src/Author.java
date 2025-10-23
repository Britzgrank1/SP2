import java.util.ArrayList;

public class Author {
private String name;
private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title titles) {
        this.titles.add(titles);
    }

    public String getName() {
        return name;
    }
    public double calculateRoyalties(){

        return 1;
    }
}




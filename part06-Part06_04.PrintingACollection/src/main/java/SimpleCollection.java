
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        //The collection alphabet is empty.
        //The collection alphabet has 1 element:
        String a = "";
        if (this.elements.isEmpty()) {
            a = "The collection "+this.name+ " is empty.";
        } else {
            if (this.elements.size() == 1) {
                a = "The collection "+this.name+ " has " + this.elements.size() + " element:";
            } else {
                a = "The collection "+this.name+ " has " + this.elements.size() + " elements:";
            }
        }
        for(String i:this.elements){
            a+="\n"+i;
        }
        return a;
    }

}

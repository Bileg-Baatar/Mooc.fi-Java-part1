
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
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        else{
            int longest = 0;
            String answer = "";
            for(String i: this.elements){
                if(i.length()>longest){
                    answer = i;
                    longest = i.length();
                }
            }
            return answer;
        }
    }
            

}

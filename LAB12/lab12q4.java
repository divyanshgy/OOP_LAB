import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
public class lab12q4 {
    public static void printBoxContents(List<? extends Box<?>> boxes) {
        for (Box<?> box : boxes) {
            System.out.println("Box contents: " + box.getContent());
        }
    }

    public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, World!");
        List<Box<?>> boxes = new ArrayList<>();
        boxes.add(intBox);
        boxes.add(stringBox);

       
        printBoxContents(boxes);
    }
}

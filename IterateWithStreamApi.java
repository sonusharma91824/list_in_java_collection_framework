package ListPrograms.ArrayList;

import java.util.Arrays;
import java.util.List;

public class IterateWithStreamApi {
    public static void main(String[] args) {


        List<String> arrayList = Arrays.asList("sonu", "khushi", "rahhul");
        arrayList.stream().forEach(System.out::println);

    }
}


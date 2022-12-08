package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import main.*;

public class TestFilterMapGender {
    @Test
    public void TestFilterMapGender() {
        Map<String, String> peopleMap = Map.of("Daniel", "M", "Claudia", "F", "Cesar", "M", "Tulip", "F");
        Stream<Entry<String, String>> filterMapGender = peopleMap.entrySet().stream()
        .filter(entry -> entry.getValue().equalsIgnoreCase("f"));

        Assert.assertTrue(filterMapGender.allMatch(v -> v.getValue().equalsIgnoreCase("f")));

    }
}


// allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil")));
package ru.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Client;

import static ru.CreateTreeKt.createTree;

@RestController
public class TestEndpoint {

    @GetMapping
    public Client getTest() {
        return createTree();
    }

}

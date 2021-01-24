package com.example.SampleOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("apis/home_api")
@RestController
public class HomeController {
    @GetMapping
    public List<String> sayHello() {
        return List.of("Hello" ," are you Okey?");
    }
}

package com.djigabajt.acceptance;

import com.djigabajt.creativewaves.CreativeWavesApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest(classes = { CreativeWavesApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestApplication {


}

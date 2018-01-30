package application;

import application.data.model.Product;
import application.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ManhNguyen on 10/11/17.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}

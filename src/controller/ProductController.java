package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
@RequestMapping("/addProduct")
public String Affichage() {
	return "addproduct";
}

}
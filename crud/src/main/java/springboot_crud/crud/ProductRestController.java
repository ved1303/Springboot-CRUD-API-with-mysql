package springboot_crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repo;

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public List<Products> getProducts() {
        return repo.findAll();

    }

}

package webapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public ResponseEntity<ProductsResponse> retrieveProducts() {
        return ResponseEntity.ok(
            new ProductsResponse(
                Arrays.asList(
                    new ProductResponse("Chair"),
                    new ProductResponse("Sofa"),
                    new ProductResponse("Television")
                )
            )
        );
    }

}

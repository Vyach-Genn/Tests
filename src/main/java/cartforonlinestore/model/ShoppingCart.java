package cartforonlinestore.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private List<Integer> cartProductsId = new ArrayList<>();


    public List<Integer> getCartProductsId() {
        return cartProductsId;
    }

    public void addProduct(Integer productId) {
        cartProductsId.add(productId);
    }
}

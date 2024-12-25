package cartforonlinestore.shoppingcart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private String productId;

    private List<Integer> cartProductsId;

    public ShoppingCart(List<Integer> cartProductsId) {
        this.cartProductsId = cartProductsId;
    }

    public List<Integer> getCartProductsId() {
        return cartProductsId;
    }

    public void addProduct(List<Integer> cartProductsId) {
        getCartProductsId().addAll(cartProductsId);
    }
}

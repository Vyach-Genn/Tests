package cartforonlinestore.service;

import cartforonlinestore.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service


public class ServiceOnlineStoreIml implements ServiceOnlineStore {

    private ShoppingCart shoppingCart;

    @Autowired
    public ServiceOnlineStoreIml(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addIdToCart(List<Integer> ids) {
        ids.forEach(shoppingCart::addProduct);

    }

    @Override
    public List<Integer> printCartProductsId() {
        return Collections.unmodifiableList(shoppingCart.getCartProductsId());
    }

}

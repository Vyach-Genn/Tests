package cartforonlinestore.service;

import cartforonlinestore.shoppingcart.ShoppingCart;

import java.util.List;

public interface ServiceOnlineStore {

    void addIdToCart(List<Integer> ids);

    void getIdFromCart(List<Integer> cartProductsId);
}

package cartforonlinestore.service;

import java.util.List;

public interface ServiceOnlineStore {

    void addIdToCart(List<Integer> ids);

    List<Integer> printCartProductsId();
}

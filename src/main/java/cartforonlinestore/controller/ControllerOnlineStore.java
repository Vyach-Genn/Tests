package cartforonlinestore.controller;

import cartforonlinestore.service.ServiceOnlineStore;
import cartforonlinestore.shoppingcart.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class ControllerOnlineStore {

    private ServiceOnlineStore serviceOnlineStore;

    @Autowired
    public ControllerOnlineStore(ServiceOnlineStore serviceOnlineStore) {
        this.serviceOnlineStore = serviceOnlineStore;
    }

    @GetMapping("/add")
    public ShoppingCart addToCart(@RequestParam("ID") Integer id) {
        return serviceOnlineStore.addIdToCart(id);

    }

    @GetMapping("/get")

    public Collection<ShoppingCart> getIdFromCart() {
        return serviceOnlineStore.getIdFromCart();
    }
}

package cartforonlinestore.controller;

import cartforonlinestore.service.ServiceOnlineStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ControllerOnlineStore {

    private ServiceOnlineStore serviceOnlineStore;

    @Autowired
    public ControllerOnlineStore(ServiceOnlineStore serviceOnlineStore) {
        this.serviceOnlineStore = serviceOnlineStore;
    }

    @GetMapping("/add")
    public void addToCart(@RequestParam("ID") List<Integer> ids) {
        serviceOnlineStore.addIdToCart(ids);

    }

    @GetMapping("/get")

    public List<Integer> getIdFromCart() {
        return serviceOnlineStore.printCartProductsId();
    }
}

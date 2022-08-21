/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.javalin.login;

/**
 *
 * @author User
 */
import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;

public class Router {
    private Javalin router;
    
    public Router(Javalin router){
        this.router = router;
        this.setRoutes();
    }
    private void setRoutes(){
        /* Account */
                 this.router.get("/",new VueComponent("login") );
                 this.router.get("/login",new VueComponent("login") );
                 this.router.error(404, "html", new VueComponent("not-found"));

//        this.router.post("/account", AccountController.createAccount);
//        this.router.get("/account/:id", AccountController.getAccount);
//        this.router.delete("/account/:id", AccountController.deleteAccount);
//        /* Transfer */
//        this.router.post("/transfer", TransferController.createTransfer);
    }
}

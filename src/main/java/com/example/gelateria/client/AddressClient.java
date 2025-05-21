//package com.example.gelateria.client;
//
//import com.example.gelateria.entity.IceCream;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(name = "magazzino",
//        url = "http://localhost:8081/", path = "provideYourContextPathHere")
//public interface AddressClient {
//    @GetMapping("/address/{id}")
//    public ResponseEntity<IceCream>
//    getIceCreamId(@PathVariable("id") Integer id);
//}
//

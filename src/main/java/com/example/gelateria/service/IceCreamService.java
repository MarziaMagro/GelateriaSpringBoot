package com.example.gelateria.service;

import com.example.gelateria.entity.IceCream;
import com.example.gelateria.mapper.IceCreamMapping;
import com.example.gelateria.model.IceCreamDto;
import com.example.gelateria.repository.IceCreamRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//BUSINESS LOGIC
public class IceCreamService {
    private final IceCreamRepo iceCreamRepo;

    @Autowired
    public IceCreamService(IceCreamRepo iceCreamRepo) {

        this.iceCreamRepo = iceCreamRepo;
    }

    //TODO: CREATE DEL GELATO
    public IceCreamDto createIceCream(IceCreamDto iceCreamDto) {
        IceCream iceCreamEntity = IceCreamMapping.convToEntity(iceCreamDto);
        IceCream iceCreamSaved = iceCreamRepo.save(iceCreamEntity);
        return IceCreamMapping.convToDto(iceCreamSaved);
    }

    //TODO: FIND BY ID
    public IceCreamDto getIceCreamById(Integer id) {
        IceCream iceCream = iceCreamRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Icecream " + id + " not found."));
        return IceCreamMapping.convToDto(iceCream);
    }

    //TODO: UPDATE IN STOCK
    public IceCreamDto sellIceCream(Integer id, Integer quantityToRemove) {
        IceCream iceCream = iceCreamRepo.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Icecream " + id + " not found"));
//        if (iceCream.getQuantity() < quantityToRemove) {
//            throw new IllegalArgumentException
//                    ("Not enough quantity in stock for " + iceCream.getTaste());
//        }
        iceCream.setQuantity(iceCream.getQuantity() - quantityToRemove);
        IceCream updatedIceCream = iceCreamRepo.save(iceCream);
        return IceCreamMapping.convToDto(updatedIceCream);
    }

    //TODO: GETALL DEI GELATI
    public List<IceCreamDto> getAll() {
        return IceCreamMapping.listDto(iceCreamRepo.findAll());
    }

}

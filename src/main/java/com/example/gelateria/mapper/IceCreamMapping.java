package com.example.gelateria.mapper;


import com.example.gelateria.entity.IceCream;
import com.example.gelateria.model.IceCreamDto;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMapping {
    public static IceCreamDto convToDto(IceCream iceCream) {
        IceCreamDto iceCreamDto = new IceCreamDto();
        iceCreamDto.setId(iceCream.getId());
        //iceCreamDto.setIceCreamTaste(TasteMapping.toDtoEnum(iceCream.getTaste()));
        iceCreamDto.setIceCreamTaste(IceCreamDto.IceCreamTasteEnum.fromValue(
                iceCream.getTaste().toString()));
        iceCreamDto.setQuantity(iceCream.getQuantity());
        iceCreamDto.setPrice(iceCream.getPrice());
        return iceCreamDto;
    }

    public static IceCream convToEntity(IceCreamDto iceCreamDto) {
        IceCream iceCream = new IceCream();
        iceCream.setId(iceCreamDto.getId());
        iceCream.setTaste(TasteMapping.toEntityEnum(iceCreamDto.getIceCreamTaste()));
        iceCream.setQuantity(iceCreamDto.getQuantity());
        iceCream.setPrice(iceCreamDto.getPrice());
        return iceCream;
    }

    /**
     * List Mapping
     * metodo convertitore di liste Dto - Entity
     */

    public static List<IceCreamDto> listDto(List<IceCream> entityList) {
        List<IceCreamDto> listDto = new ArrayList<>();
        for (IceCream icecream : entityList) {
            IceCreamDto iceCreamDto = IceCreamMapping.convToDto(icecream);
            listDto.add(iceCreamDto);
        }
        return listDto;
    }

    public static List<IceCream> listEntity(List<IceCreamDto> dtoList) {
        List<IceCream> listEntity = new ArrayList<>();
        for (IceCreamDto iceCreamDto : dtoList) {
            IceCream iceCream = IceCreamMapping.convToEntity(iceCreamDto);
            listEntity.add(iceCream);
        }
        return listEntity;
    }
}

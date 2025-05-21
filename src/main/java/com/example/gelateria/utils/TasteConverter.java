//package com.example.gelateria.utils;
//
//import com.example.gelateria.entity.IceCreamTaste;
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//
///**
// * JPA Converter per salvare
// * e leggere l'enum IceCreamTaste
// * come intero (tasteCode) nel database
// */
//
//@Converter(autoApply = true)
//public class TasteConverter implements AttributeConverter<IceCreamTaste, String> {
//    private IceCreamTaste taste;
//
//    @Override
//    public String convertToDatabaseColumn(IceCreamTaste attribute) {
//        if (attribute == null) return null;
//        return attribute.getTasteCode();
//
//    }
//
//    public IceCreamTaste convertToEntityAttribute(String dbData) {
//        if (dbData == null) return null;
//        return IceCreamTaste.valueFromCode(dbData);
//    }
//}

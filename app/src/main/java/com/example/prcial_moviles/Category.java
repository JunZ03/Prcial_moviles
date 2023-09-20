package com.example.prcial_moviles;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String description;
    private String color;
    private String icon;


    public Category(String name, String description, String color, String icon) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.icon = icon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    public static List<Category> loadFakeDataCategorias() {
        List<Category> categories = new ArrayList<>();


        categories.add(new Category("Categoria1", "Descripción de la Categoria 1", "Rojo", "icono1.png"));
        categories.add(new Category("Categoria2", "Descripción de la Categoria 2", "Azul", "icono2.png"));
        categories.add(new Category("Categoria3", "Descripción de la Categoria 3", "Verde", "icono3.png"));

        return categories;
    }

    public static void main(String[] args) {
        List<Category> categories = Category.loadFakeDataCategorias();

        for (Category category : categories) {
            System.out.println("Nombre: " + category.getName());
            System.out.println("Descripción: " + category.getDescription());
            System.out.println("Color: " + category.getColor());
            System.out.println("Icono: " + category.getIcon());
            System.out.println();
        }
    }
}

}

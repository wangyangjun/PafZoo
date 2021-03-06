package com.paf.zoo.service;

import com.paf.zoo.model.Animal;
import com.paf.zoo.model.DisplayAble;

import java.util.Collection;
import java.util.UUID;

public interface Zoo extends DisplayAble {

    Collection<Animal> getAnimals();

    void liveOneDay();

    void exit();

    boolean addAnimal(Animal animal);

    boolean removeAnimal(UUID uuid);
}

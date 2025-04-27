package xyz.hooy.frameworkthink.factory.abstract_factory;

import xyz.hooy.frameworkthink.factory.abstract_factory.product.*;

public class EuropeanFurniture extends AbstractFurniture {

    @Override
    public Sofa produceSofa() {
        return new EuropeanSofa();
    }

    @Override
    public Wardrobe produceWardrobe() {
        return new EuropeanWardrobe();
    }

    @Override
    public Bed produceBed() {
        return new EuropeanBed();
    }
}

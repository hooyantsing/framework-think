package xyz.hooy.frameworkthink.factory.abstract_factory;

import xyz.hooy.frameworkthink.factory.abstract_factory.product.*;

public class ChineseFurniture extends AbstractFurniture {

    @Override
    public Sofa produceSofa() {
        return new ChineseSofa();
    }

    @Override
    public Wardrobe produceWardrobe() {
        return new ChineseWardrobe();
    }

    @Override
    public Bed produceBed() {
        return new ChineseBed();
    }
}

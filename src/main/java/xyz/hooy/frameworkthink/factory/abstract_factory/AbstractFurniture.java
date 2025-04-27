package xyz.hooy.frameworkthink.factory.abstract_factory;

import xyz.hooy.frameworkthink.factory.abstract_factory.product.Bed;
import xyz.hooy.frameworkthink.factory.abstract_factory.product.Sofa;
import xyz.hooy.frameworkthink.factory.abstract_factory.product.Wardrobe;

public abstract class AbstractFurniture {

    public abstract Sofa produceSofa();

    public abstract Wardrobe produceWardrobe();

    public abstract Bed produceBed();
}

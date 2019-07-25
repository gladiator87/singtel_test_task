package ru.ivanov.singtel.insect;

/**
 * Class convert caterpillar into beautiful butterfly.
 */
public class ButterflyConverter implements IncectConverter<Caterpillar, Butterfly> {

    @Override
    public Butterfly convert(Caterpillar insect) {
        //some possible transformation
        return new Butterfly();
    }
}

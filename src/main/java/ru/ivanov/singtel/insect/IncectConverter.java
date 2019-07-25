package ru.ivanov.singtel.insect;

/**
 * Interface for converting insect from one kind into another
 * @param <T> convert from insect of type T
 * @param <E> convert to insect of type E
 */
public interface IncectConverter<T,E> {
    E convert(T insect);
}

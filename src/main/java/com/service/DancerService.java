package com.service;

import com.model.Dancer;

import java.util.List;
import java.util.Optional;

public interface DancerService {

    /**
     * Создает нового клиента
     *
     * @param dancer - клиент для создания
     */
    void create(Dancer dancer);

    /**
     * Возвращает список всех имеющихся клиентов
     *
     * @return список клиентов
     */
    List<Dancer> readAll();

    /**
     * Возвращает клиента по его ID
     *
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
//    Dancer read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     *
     * @param dancer - клиент в соответсвии с которым нужно обновить данные
     * @param id     - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Dancer dancer, int id);

    /**
     * Удаляет клиента с заданным ID
     *
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);

    List<Dancer> getDancerByCode(Integer code);

    List<Dancer> getDancersByName(String name);

    List<Dancer> getDancersByClub(String club);
}
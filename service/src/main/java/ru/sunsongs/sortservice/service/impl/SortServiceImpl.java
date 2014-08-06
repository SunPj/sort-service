package ru.sunsongs.sortservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ru.sunsongs.sortservice.model.SortType;
import ru.sunsongs.sortservice.service.SortAlgorithm;
import ru.sunsongs.sortservice.service.SortService;
import ru.sunsongs.sortservice.service.exception.UnknownSortTypeException;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kraken
 * @time 8/2/14 11:15 AM
 */
@Service
public class SortServiceImpl implements SortService {

    @Autowired
    private ApplicationContext context;

    // доступные алгоритмы для сортировки
    private Map<Integer, SortAlgorithm> algorithms;

    @PostConstruct
    private void initAlgorithms(){
        algorithms = new HashMap<Integer, SortAlgorithm>();
        for (SortAlgorithm a: context.getBeansOfType(SortAlgorithm.class).values()) {
            int algId = a.getType().getId();
            if (algorithms.containsKey(algId)){
                // TODO
                throw new RuntimeException("");
            }
            algorithms.put(algId, a);
        };
    }

    @Override
    public int[] sort(int sortTypeId, int[] array) throws UnknownSortTypeException {
        if (!algorithms.containsKey(sortTypeId)){
            throw new UnknownSortTypeException();
        }

        return algorithms.get(sortTypeId).sort(array);
    }

    @Override
    public Map<String, Integer> getAvailableAlgorithms() {
        Map<String, Integer> availableAlgorithms = new HashMap<>();
        for (Map.Entry<Integer, SortAlgorithm> entry : algorithms.entrySet()) {
            availableAlgorithms.put(entry.getValue().getType().getName(), entry.getKey());
        }

        return availableAlgorithms;
    }

    @Override
    public double getPrice(int id) throws UnknownSortTypeException {
        return getSortTypeByTypeId(id).getPrice();
    }

    @Override
    public SortType getSortTypeByTypeId(int typeId) throws UnknownSortTypeException {
        for (Map.Entry<Integer, SortAlgorithm> entry : algorithms.entrySet()) {
            if (entry.getKey().equals(typeId)){
                return entry.getValue().getType();
            }
        }

        throw new UnknownSortTypeException();
    }
}

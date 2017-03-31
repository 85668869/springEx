package com.spittr.data;
import com.spittr.model.Spittle;

import java.util.List;

/**
 * Created by chun on 2017/3/25.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittledId);
}

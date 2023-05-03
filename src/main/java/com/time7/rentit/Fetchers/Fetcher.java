package com.time7.rentit.Fetchers;

import com.time7.rentit.Schemas.QueryResult;

/**
 *
 * @author Paulo Henrique
 */
public interface Fetcher<T> {

    public T fetch( QueryResult qr ) throws Exception;
}
